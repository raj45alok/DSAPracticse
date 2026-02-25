import os

BASE_DIR = "problems"
README_FILE = "README.md"

def format_problem_name(filename):
    name = filename.replace(".java", "").replace(".py", "")
    parts = name.split("_")

    # remove source prefix
    if parts[0] in ["lc", "gfg", "intellij"]:
        parts = parts[1:]

    return " ".join(word.capitalize() for word in parts)

def detect_source(filename):
    if filename.startswith("lc_"):
        return "LeetCode"
    elif filename.startswith("gfg_"):
        return "GeeksForGeeks"
    elif filename.startswith("intellij_"):
        return "Practice"
    return "Unknown"

def detect_language(filename):
    if filename.endswith(".java"):
        return "Java"
    elif filename.endswith(".py"):
        return "Python"
    return "Unknown"

def generate_readme():
    content = "# 🚀 DSA Practice Repository\n\n"
    content += "Structured by topic and automated via scripts.\n\n"

    for topic in sorted(os.listdir(BASE_DIR)):
        topic_path = os.path.join(BASE_DIR, topic)

        if not os.path.isdir(topic_path):
            continue

        topic_title = topic.split("-", 1)[1].replace("-", " ").title()
        content += f"## {topic_title}\n\n"
        content += "| Problem | Language | Source |\n"
        content += "|----------|----------|--------|\n"

        for lang_folder in os.listdir(topic_path):
            lang_path = os.path.join(topic_path, lang_folder)

            if not os.path.isdir(lang_path):
                continue

            for file in sorted(os.listdir(lang_path)):
                problem_name = format_problem_name(file)
                language = detect_language(file)
                source = detect_source(file)

                content += f"| {problem_name} | {language} | {source} |\n"

        content += "\n"

    with open(README_FILE, "w", encoding="utf-8") as f:
        f.write(content)

if __name__ == "__main__":
    generate_readme()
    print("README generated successfully!")
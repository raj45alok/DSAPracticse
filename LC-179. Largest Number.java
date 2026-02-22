// Approach - Arrays ko string me convert krke number bana ke check karo kis case me bada aa rha usko aage le aao using reverse bubble sort for this question //

class Solution {
    public String largestNumber(int[] nums) {
        int len = nums.length;
        String[] elements = new String[len];
        String s1="",s2="",temp ="", ans="",ans1="";
        //int num1=0,num2=0;
        for(int i=0;i<len;i++)
        {
            elements[i]= Integer.toString(nums[i]);
        }
       // Arrays.sort(elements);
       
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                s1= elements[i].concat(elements[j]);
                s2=elements[j].concat(elements[i]);
                //num1 = Integer.parseInt(s1);
               // num2 = Integer.parseInt(s2);
                if (s2.compareTo(s1) > 0)
                {
                    temp = elements[i];
                    elements[i]=elements[j];
                  elements[j]  = temp;

                }

            }
        }

         if(elements[0].equals("0"))
        {
             ans1="0";
             return ans1;
        }

       /* StringBuilder sb = new StringBuilder();
        for(String s : elements)
        {
            sb.append(elements);
        }
        ans = sb.toString();
        return ans ;*/
        
        for(int i =0;i<len;i++)
        {
             ans =ans.concat(elements[i]);
        }

        return ans;

    }
}


        

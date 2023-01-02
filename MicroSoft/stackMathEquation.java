class stackMathEquation {
    public int evalRPN(String[] a) {
        Stack<Integer> st = new Stack<>();
        ArrayList<String> cont = new ArrayList<>();
        cont.add("+");
        cont.add("-");
        cont.add("*");
        cont.add("/");
       // int ans = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(cont.contains(a[i]))
            {
                int first = st.pop();
                int second = st.pop();

                if(a[i].equals("+"))
                {
                    int ans = first+second;
                    st.push(ans);
                }
                else if(a[i].equals("-"))
                {
                    int ans = second-first;
                    st.push(ans);
                }
                else if(a[i].equals("*"))
                {
                    int ans = first*second;
                    st.push(ans);
                }
                else
                {
                    int ans = second/first;
                    st.push(ans);
                }

            }
            else
            {
                int t = Integer.parseInt(a[i]);
                st.push(t);
            }
        }

        return st.pop();
    }
}
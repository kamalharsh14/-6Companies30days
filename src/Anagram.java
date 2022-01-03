//Problem Link: https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/

import java.util.*;
class Anagrams{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String string_list[] = new String[n];
        for(int i = 0 ; i < n ; i ++){
            string_list[i] = in.nextLine();
        }
        List<List<String>> Anagrams = new ArrayList<List<String>>();
        HashMap<HashMap<Character, Integer>, ArrayList<String>> bmap = new HashMap<>();

        for(String str: string_list){
            HashMap<Character, Integer> fmap = new HashMap<>();

            for(int i = 0 ; i < str.length() ; i ++){
                char ch = str.charAt(i);
                fmap.put(ch, fmap.getOrDefault(ch,0)+1);
            }
            
            if(bmap.containsKey(fmap)){
                ArrayList<String> list = bmap.get(fmap);
                list.add(str);
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                bmap.put(fmap,list);
            }
        }

        for(ArrayList<String> val: bmap.values()){
            Anagrams.add(val);
        }

        System.out.println(Anagrams);
        in.close();
    }
}
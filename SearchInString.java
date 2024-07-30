package Questions;
public class SearchInString {
    public static void main(String[] args) {
        String name = "Sriharsh";
        char target = 'a';
        System.out.println(search(name,target));
    }

    private static boolean search2(String name, char target) {
        if (name.length() == 0){
            return false;
        }
        for(char ch : name.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
    private static boolean search(String name, char target) {
        if (name.length() == 0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)){
                return true;
            }
        }

        return false;
    }
}

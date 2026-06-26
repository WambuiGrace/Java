public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "Automation";
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for(char c : str.toCharArray()){
            if("aeiou".indexOf(c) != -1){
                vowels++;
            }
            else if(Character.isLetter(c)){
                consonants++;
            }
        }
        System.out.println("Consonants: "+consonants+ ", Vowels: "+vowels);
    }
}

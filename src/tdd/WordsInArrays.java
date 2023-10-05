package tdd;

public class WordsInArrays {
        public String swapIndex(String word, int[] index) {
            if (word == null || index == null) {
                return null;
            }
            if (word.length() != index.length) {
                return null;
            }
            char[] rearranged = new char[word.length()];

            for (int i = 0; i < index.length; i++) {
                int currentIndex = index[i];

                if (currentIndex < 0 || currentIndex >= word.length()) {
                    return null;
                }

                rearranged[i] = word.charAt(currentIndex);
            }

            return new String(rearranged);
        }

        public String swapGuy(String words, int[] index){

            if(words.length() < index.length || words.length() > index.length){
                throw new RuntimeException("words and index should the same length");
            }

           char[] rearrange = new char[words.length()];

            for (int i = 0; i < index.length; i++) {
                int newWord = index[i];
                rearrange[i] = words.charAt(newWord);
            }
            return new String(rearrange);
        }

    }


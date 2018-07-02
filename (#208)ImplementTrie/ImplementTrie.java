class TrieTree{
    
    private boolean isWord = false;
    private TrieTree[] child = new TrieTree[26];
    private char val;
    
    public TrieTree(){        
    }
    public TrieTree(char val){
        this.val = val;
    }
    
    public void setIsWord(){
         isWord = true;
    }
    public boolean getIsWord(){
        return isWord;
    }
    public char getVal(){
        return val;
    }
    public TrieTree getChild(int index){
        return child[index];
    }
    public void setChild(int index, char ch){
        child[index] = new TrieTree(ch);
    }
}


public class Trie {
    private TrieTree root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieTree(' ');
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieTree point = root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(point.getChild(ch - 'a') == null){
                point.setChild(ch - 'a', ch);
            }
            point = point.getChild(ch - 'a');
        }
        point.setIsWord();
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieTree point = root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(point.getChild(ch - 'a') == null) return false;
            point = point.getChild(ch - 'a');
        }
        return point.getIsWord();
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieTree point = root;
        for(int i = 0; i < prefix.length(); i++){
            char ch = prefix.charAt(i);
            if(point.getChild(ch - 'a') == null) return false;
            point = point.getChild(ch - 'a');
        }
        return true;
    }
}
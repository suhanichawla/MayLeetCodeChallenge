package mayLeetCode;

public class Trie {
	private class Node{
		char data;
		HashMap<Character,Node> children;
		boolean isTerminal;
		Node(char data,boolean isterminal){
			this.data=data;
			this.isTerminal=isterminal;
			this.children=new HashMap<Character,Node>();
		}
	}
	private Node root;

    /** Initialize your data structure here. */
    public Trie() {
        this.root=new Node('\0',false);
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        this.addWord(this.root,word);
    }
    
    private void addWord(Node node, String word) {
		if(word.length()==0) {
			if(!node.isTerminal) {
				node.isTerminal=true;
			}
			return;
		}
		char cc=word.charAt(0);
		String ros=word.substring(1);
		if(node.children.containsKey(cc)) {
			addWord(node.children.get(cc),ros);
		}else {
			Node tba=new Node(cc,false);
			node.children.put(cc, tba);
			addWord(tba,ros);
		}
		
	}
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
		return this.search(this.root,word);
	}
	private boolean search(Node node, String word) {
		if(word.length()==0) {
			if(node.isTerminal) {
				return true;
			}
			return false;
		}
		char cc=word.charAt(0);
		String ros=word.substring(1);
		if(node.children.isEmpty() || !node.children.containsKey(cc)) {
			return false;
		}
		return search(node.children.get(cc),ros);
		
	}
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return this.startsWith(this.root,prefix);
    }
    private boolean startsWith(Node node, String word) {
		if(word.length()==0) {
			return true;
		}
		char cc=word.charAt(0);
		String ros=word.substring(1);
		if(node.children.isEmpty() || !node.children.containsKey(cc)) {
			return false;
		}
		return startsWith(node.children.get(cc),ros);
		
	}

}

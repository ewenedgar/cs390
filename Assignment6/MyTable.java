package Assignment6;

public class MyTable {
	private Entry[] entries;
	
	private class Entry{
		private String s;
		private char c = 'c';
		
		public Entry(char c, String s) {
			this.c = c;
			this.s = s;
			
		}

		public void setS(String s) {
			this.s = s;
		}
		public void setC(char s) {
			this.c = s;
		}
		public String getS() {
			return s;
		}
		public char getC() {
			return c;
		}
		@Override
		public String toString() {
			return  getC()+" -> "+getS();
		}
	}
	 public MyTable() {
	        entries = new Entry[26];
	    }

	    public String get(char c) {
	        int index = c - 'a';
	        if (index >= 0 && index < 26 && entries[index] != null) {
	            return entries[index].getS();
	        }
	        return null;
	    }
	 @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        for (Entry entry : entries) {
	            if (entry != null) {
	                sb.append(entry.toString()).append("\n");
	            }
	        }
	        return sb.toString();
	    }
	public void add(char c, String s) {
		 int index = c - 'a';
	        if (index >= 0 && index < 26) {
	            entries[index] = new Entry(c, s);
	        }
	}
	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		
		
		System.out.println(t);
		
	}

}

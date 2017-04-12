public String countAndSay(int n) {
	StringBuilder curr = new StringBuilder("1");
	StringBuilder prev;
	int count = 0;
	char say;
	for (int i = 1; i < n; i++) {
		prev = curr;
		say = prev.charAt(0);
		curr = new StringBuilder();
		count = 1;
		for (int j = 1; j < prev.length(); j++) {
			if(prev.charAt(j) != say) {
				curr.append(count).append(say);
				count = 1;
				say = prev.charAt(j);
			}
			else count++;
		}
		curr.append(count).append(say);
	} 
	return curr.toString();
}
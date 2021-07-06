/**
 * This method takes a Map containing users and their encrypted passwords.  
 * It also takes a Set containing the encrypted version of known weak passwords
 * 
 * It examines every user's password and returns a sorted Set containing the weak passwords currently in use as String types 
 * 
 * The returned Sey may be empty if no user has a weak password
 **/
public SortedSet<String> findWeakPasswords(Map<String, String> users, Set<String> weakPasswords)
{
   Set<String> ssswp = new HashSet<String>(users.values());
   weakPasswords.retainAll(ssswp);
   
   SortedSet<String> badPs = new TreeSet<String>(weakPasswords);
   
   return badPs;
}

//Tests
Map<String, String> userMap = new HashMap<String, String>();
userMap.put ("User1","fsfgui");
userMap.put ("User2","ytyty");
userMap.put ("User3","kljdkljdl");
userMap.put ("User4","kljdlkjd");
userMap.put ("User5","yudtyud");

Set<String> weakPasswords = new HashSet<String>();
weakPasswords.add("kljdkljdl");

System.out.println(findWeakPasswords(userMap, weakPasswords));



Map<String, String> userMap = new HashMap<String, String>();
userMap.put ("User1","fsfgui");
userMap.put ("User2","ytyty");
userMap.put ("User3","kljdkljdl");
userMap.put ("User4","kljdlkjd");
userMap.put ("User5","yudtyud");

Set<String> weakPasswords = new HashSet<String>();
weakPasswords.add("kfljdkljdl");

System.out.println(findWeakPasswords(userMap, weakPasswords));

	

Map<String, String> userMap = new HashMap<String, String>();
userMap.put ("User1","fsfgui");
userMap.put ("User2","ytyty");
userMap.put ("User3","kljdkljdl");
userMap.put ("User4","kljdlkjd");
userMap.put ("User5","yudtyud");

Set<String> weakPasswords = new HashSet<String>();
weakPasswords.add("kljdkljdl");
weakPasswords.add("ytyty");

System.out.println(findWeakPasswords(userMap, weakPasswords));



Map<String, String> userMap = new HashMap<String, String>();
userMap.put ("User1","fsfgui");
userMap.put ("User2","ytyty");
userMap.put ("User3","kljdkljdl");
userMap.put ("User4","kljdlkjd");
userMap.put ("User5","kljdkljdl");

Set<String> weakPasswords = new HashSet<String>();
weakPasswords.add("kljdkljdl");

System.out.println(findWeakPasswords(userMap, weakPasswords));
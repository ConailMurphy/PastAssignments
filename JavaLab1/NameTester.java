class NameTester {

    public static void main(String[] args) {
        Name n = new Name();
        
        n.setTitle("Sir");
        n.setForename("Hugh");
        n.setSurname("Jeegoh");
        
        String s1 = n.getTitle();
        String s2 = n.getForename();
        String s3 = n.getSurname();
        
        System.out.println(n.getFullName()); // displays "Sir Hugh Jeegoh"
        System.out.println(n); // displays the same as the previous statement
        System.out.println(n.getShortName()); // displays "Sir H. Jeegoh"
    }
    
}
public class javastring {
    public static void main(String[] args){
        String name = "bob";
        String name2 = new String("bob");

        System.out.println(name + name2);


        String email = "nate.adam@bbobaboom.g0v";
        String email2 = "brandon.spencer@gmaLi.com";
        // print name
        System.out.println(email);
        System.out.println(email.length());
        System.out.println(email.substring(0,9));
        System.out.println(email2.substring(0,email2.indexOf("@")));


        System.out.println(email2.indexOf("o"));

        System.out.println(email.substring(0,email.indexOf("@")).equals(email2.substring(0,email2.indexOf("@"))));

    }
}

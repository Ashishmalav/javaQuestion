public class P_SET_Q_CWH_3
{public static void main(String[]args)
{//Q no.1
    String name = "MY  NAME IS DARK SOUL";
    name=name.toLowerCase();
    System.out.println(name);
    //Q no.2
    name=name.replace(' ','_');
    System.out.println(name);
    //Q no 3
    String letter="Dear <|name|>,thanks for the gift";
    letter=letter.replace("<|name|>","AASHU");
    System.out.println(letter);
    //Q no 4
    System.out.println(name.indexOf("__"));
    System.out.println((name.indexOf("___")));
    String Speach=" hamare director  sahab ne yaha iss collge me chamatkar pe  chamatkar kiye hai .\nhame to ashchary hota hai ki ek  insan apne  sampurn jivankal me \nintne chamatkar kese kar skata hai ";
    System.out.println(Speach.replace("chamatkar","balatkar"));
}

}
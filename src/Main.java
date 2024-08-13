import java.util.Optional;

public class Main {
    public static String cevir(Optional<String> optionalsoz) {
        return optionalsoz.map(word -> {
            String upperWord = word.toUpperCase();

            if (upperWord.startsWith("T")) {
                return upperWord;
            } else {
                return "DEFAULT";
            }
        }).orElse("DEFAULT");
    }

    public static void main(String[] args) {
//        Optional<String> soz = Optional.of("test");
//        System.out.println(cevir(soz));
//
//        Optional<String> soz2 = Optional.empty();
//        System.out.println(cevir(soz2));



        //sual2

        UserService userService = new UserService();

        User user1 = new User("user1@example.com");
        userService.addUser(1, user1);

        String userEmail = userService.getUserEmailById(1);
        System.out.println("User Email: " + userEmail);

        boolean exists = userService.doesUserExist(1);
        System.out.println("Does User Exist: " + exists);
    }
}

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Денис";
        post.passport = "1111 №111111";
        post.patronymic = "Игоревич";
        post.phone = "+7 912 345 67 89";
        post.surname = "Козлятин";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

    }
}

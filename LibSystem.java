import java.util.*;

class LibSystem {

    Scanner sc = new Scanner(System.in);

    int bookId;
    String bookName;
    String author;
    boolean issued = false;

    void menu() {
        System.out.println("\n===== Library Management System =====");
        System.out.println("1. Add Book");
        System.out.println("2. View Book");
        System.out.println("3. Search Book");
        System.out.println("4. Issue Book");
        System.out.println("5. Return Book");
        System.out.println("6. Delete Book");
        System.out.println("7. Library Report");
        System.out.println("8. Exit");
    }

    void addBook() {
        System.out.println("\nEnter Book ID : ");
        bookId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Book Name : ");
        bookName = sc.nextLine();

        System.out.println("Enter Author Name : ");
        author = sc.nextLine();

        issued = false;

        System.out.println("Book Added Successfully");
    }

    void viewBook() {
        System.out.println("\n===== Book Details =====");

        System.out.println("Book ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);

        if (issued == true)
            System.out.println("Status : Issued");
        else
            System.out.println("Status : Available");
    }

    void searchBook() {
        System.out.println("\nEnter Book ID : ");
        int id = sc.nextInt();

        if (id == bookId) {
            System.out.println("Book Found");
            System.out.println("Book Name : " + bookName);
            System.out.println("Author : " + author);
        }
        else {
            System.out.println("Book Not Found");
        }
    }

    void issueBook() {
        if (issued == false) {
            issued = true;
            System.out.println("Book Issued Successfully");
        }
        else {
            System.out.println("Book is already issued");
        }
    }

    void returnBook() {
        if (issued == true) {
            issued = false;
            System.out.println("Book Returned Successfully");
        }
        else {
            System.out.println("Book is already available");
        }
    }

    void deleteBook() {
        bookId = 0;
        bookName = "";
        author = "";
        issued = false;

        System.out.println("Book Deleted Successfully");
    }

    void report() {
        System.out.println("\n===== Library Report =====");

        if (bookId == 0) {
            System.out.println("No Book Available");
        }
        else {
            System.out.println("Book ID : " + bookId);
            System.out.println("Book Name : " + bookName);
            System.out.println("Author : " + author);

            if (issued == true)
                System.out.println("Status : Issued");
            else
                System.out.println("Status : Available");
        }
    }

    public static void main(String[] args) {

        LibSystem obj = new LibSystem();

        int choice;

        do {
            obj.menu();

            System.out.println("Enter Choice : ");
            choice = obj.sc.nextInt();

            switch (choice) {

                case 1:
                    obj.addBook();
                    break;

                case 2:
                    obj.viewBook();
                    break;

                case 3:
                    obj.searchBook();
                    break;

                case 4:
                    obj.issueBook();
                    break;

                case 5:
                    obj.returnBook();
                    break;

                case 6:
                    obj.deleteBook();
                    break;

                case 7:
                    obj.report();
                    break;

                case 8:
                    System.out.println("Thanks for using Library Management System");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 8);
    }
}
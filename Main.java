package Action;

import java.util.ArrayList;
import java.util.Scanner;

import Products.*;

public class Main{

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        ArrayList<NoteBook> notebooks = new ArrayList<NoteBook>();
        ArrayList<Pen> pens = new ArrayList<Pen>();
        ArrayList<Pencil> pencils = new ArrayList<Pencil>();
        while (true)
        {
            System.out.print("Nhập tên đăng nhập: ");
            Login login = new Login();
            Admin admin = new Admin();
            Guest guest = new Guest();

            login.signIn();
            if(login.getUserName().equals("admin"))
            {
                while(true)
                {
                    admin.adminAction();
                    int action = Integer.valueOf(sc.nextLine());
                    if(action == 6)
                    {
                        System.out.println("Đã thoát về đăng nhập.");
                        break;
                    }
                    switch(action)
                    {
                        case 1:
                            admin.item();
                            int addAction = Integer.valueOf(sc.nextLine());
                            switch(addAction)
                            {
                                case 1:
                                    admin.addBook(books);
                                    break;
                                case 2:
                                    admin.addNotebook(notebooks);
                                    break;
                                case 3:
                                    admin.addPen(pens);
                                    break;
                                case 4:
                                    admin.addPencil(pencils);
                                    break;
                            }
                            break;
                        case 2:
                            admin.fixItem(books, notebooks, pens, pencils);
                            break;
                        case 3:
                            admin.deleteItem(books, notebooks, pens, pencils);
                            break;
                        case 4:
                            guest.findItems(books, notebooks, pens, pencils);
                            break;
                        case 5:
                            guest.showListItems(books, notebooks, pens, pencils);
                            break;
                    }
                }
            }
            else {
                while (true)
                {
                    guest.guestAction();
                    int action = Integer.valueOf(sc.nextLine());
                    if(action == 3)
                    {
                        System.out.println("Đã thoát về đăng nhập.");
                        break;
                    }
                    else if(action == 1)
                    {
                        guest.findItems(books, notebooks, pens, pencils);
                    }
                    else guest.showListItems(books, notebooks, pens, pencils);
                }
            }
        }
    }
}
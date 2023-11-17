package Action;

import java.util.ArrayList;
import java.util.Scanner;
import Products.*;

public class Admin{
    public static Scanner sc = new Scanner(System.in);

    public void adminAction (){
        System.out.println("Menu admin");
        System.out.println("1.Thêm mặt hàng mới");
        System.out.println("2.Sửa");
        System.out.println("3.Xóa");
        System.out.println("4.Tìm");
        System.out.println("5.Xem danh sách");
        System.out.println("6.Thoát về đăng nhập");
        System.out.print("Chọn thao tác: ");
    }

    public void item()
    {
        System.out.println("Lựa chọn mặt hàng cần thêm:");
        System.out.println("1.Sách");
        System.out.println("2.Vở ghi");
        System.out.println("3.Bút mực");
        System.out.println("4.Bút chì");
    }

    public void addBook (ArrayList<Book> books) {
        System.out.print("Nhập tên sách: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá bán: ");
        String price = sc.nextLine();
        System.out.print("Nhập thương hiệu: ");
        String brand = sc.nextLine();
        System.out.print("Nhập thể loại: ");
        String genre = sc.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String author = sc.nextLine();
        System.out.print("Nhập nhà xuất bản: ");
        String publisher = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        String publish = sc.nextLine();
        System.out.print("Nhập ngôn ngữ: ");
        String language = sc.nextLine();
        Book x = new Book();
        x.setName(name);
        x.setGenre(genre);
        x.setAuthor(author);
        x.setPublish(publish);
        x.setLanguage(language);
        x.setPublisher(publisher);
        x.setPrice(price);
        x.setBrand(brand);
        books.add(x);
        System.out.println("Đã thêm sách.");
    }

    public void addPen(ArrayList<Pen> pens)
    {
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá bán: ");
        String price = sc.nextLine();
        System.out.print("Nhập thương hiệu: ");
        String brand = sc.nextLine();
        System.out.print("Nhập màu sắc: ");
        String color = sc.nextLine();
        System.out.print("Nhập chất liệu: ");
        String material = sc.nextLine();
        System.out.print("Nhập loại mực: ");
        String type = sc.nextLine();
        System.out.print("Nhập độ min: ");
        String smooth = sc.nextLine();
        Pen x = new Pen();
        x.setName(name);
        x.setPrice(price);
        x.setBrand(brand);
        x.setColor(color);
        x.setMaterial(material);
        x.setType(type);
        x.setSmooth(smooth);
        pens.add(x);
        System.out.println("Đã thêm bút.");
    }

    public void addPencil(ArrayList<Pencil> pencils)
    {
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá bán: ");
        String price = sc.nextLine();
        System.out.print("Nhập thương hiệu: ");
        String brand = sc.nextLine();
        System.out.print("Nhập màu sắc: ");
        String color = sc.nextLine();
        System.out.print("Nhập chất liệu: ");
        String material = sc.nextLine();
        System.out.print("Nhập độ cứng: ");
        String hardness = sc.nextLine();
        Pencil x = new Pencil();
        x.setName(name);
        x.setPrice(price);
        x.setBrand(brand);
        x.setColor(color);
        x.setMaterial(material);
        x.setHardness(hardness);
        pencils.add(x);
        System.out.println("Đã thêm bút chì.");
    }
    public void addNotebook(ArrayList<NoteBook> notebooks)
    {
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá bán: ");
        String price = sc.nextLine();
        System.out.print("Nhập thương hiệu: ");
        String brand = sc.nextLine();
        System.out.print("Nhập số trang: ");
        String pages = sc.nextLine();
        System.out.print("Nhập loại vở: ");
        String type = sc.nextLine();
        System.out.print("Nhập màu sắc bìa: ");
        String color = sc.nextLine();
        System.out.print("Nhập chất liệu giấy: ");
        String material = sc.nextLine();
        System.out.print("Nhập kich thước: ");
        String size = sc.nextLine();
        NoteBook x = new NoteBook();
        x.setName(name);
        x.setPrice(price);
        x.setBrand(brand);
        x.setType(type);
        x.setPages(pages);
        x.setColor(color);
        x.setMaterial(material);
        x.setSize(size);
        notebooks.add(x);
        System.out.println("Đã thêm vở.");
    }

    public void deleteItem(ArrayList<Book> books, ArrayList<NoteBook> notebooks, ArrayList<Pen> pens, ArrayList<Pencil> pencils)
    {
        System.out.println("Nhập mặt hàng muốn xóa: ");
        String item = sc.nextLine();
        System.out.println("Nhập id: ");
        int i = Integer.valueOf(sc.nextLine());
        if(item.equals("sách")) books.remove(i-1);
        else if(item.equals("vở")) notebooks.remove(i-1);
        else if(item.equals("bút mực")) pens.remove(i-1);
        else pencils.remove(i-1);
    }

    public void fixItem(ArrayList<Book> books, ArrayList<NoteBook> notebooks, ArrayList<Pen> pens, ArrayList<Pencil> pencils)
    {
        System.out.println("Nhập mặt hàng muốn sửa: ");
        String item = sc.nextLine();
        System.out.println("Nhập id: ");
        int i = Integer.valueOf(sc.nextLine());
        if(item.equals("sách"))
        {
            System.out.print("Nhập tên sách: ");
            String name = sc.nextLine();
            System.out.print("Nhập giá bán: ");
            String price = sc.nextLine();
            System.out.print("Nhập thương hiệu: ");
            String brand = sc.nextLine();
            System.out.print("Nhập thể loại: ");
            String genre = sc.nextLine();
            System.out.print("Nhập tên tác giả: ");
            String author = sc.nextLine();
            System.out.print("Nhập nhà xuất bản: ");
            String publisher = sc.nextLine();
            System.out.print("Nhập năm xuất bản: ");
            String publish = sc.nextLine();
            System.out.print("Nhập ngôn ngữ: ");
            String language = sc.nextLine();
            books.get(i-1).setName(name);
            books.get(i-1).setGenre(genre);
            books.get(i-1).setAuthor(author);
            books.get(i-1).setPublish(publish);
            books.get(i-1).setLanguage(language);
            books.get(i-1).setPublisher(publisher);
            books.get(i-1).setPrice(price);
            books.get(i-1).setBrand(brand);
            System.out.println("Đã sửa sách.");
        }
        else if(item.equals("vở"))
        {
            System.out.print("Nhập tên: ");
            String name = sc.nextLine();
            System.out.print("Nhập giá bán: ");
            String price = sc.nextLine();
            System.out.print("Nhập thương hiệu: ");
            String brand = sc.nextLine();
            System.out.print("Nhập số trang: ");
            String pages = sc.nextLine();
            System.out.print("Nhập loại vở: ");
            String type = sc.nextLine();
            System.out.print("Nhập màu sắc bìa: ");
            String color = sc.nextLine();
            System.out.print("Nhập chất liệu giấy: ");
            String material = sc.nextLine();
            System.out.print("Nhập kich thước: ");
            String size = sc.nextLine();
            NoteBook x = new NoteBook();
            notebooks.get(i-1).setName(name);
            notebooks.get(i-1).setPrice(price);
            notebooks.get(i-1).setBrand(brand);
            notebooks.get(i-1).setType(type);
            notebooks.get(i-1).setPages(pages);
            notebooks.get(i-1).setColor(color);
            notebooks.get(i-1).setMaterial(material);
            notebooks.get(i-1).setSize(size);
            System.out.println("Đã sửa vở.");
        }
        else if(item.equals("bút mực"))
        {
            System.out.print("Nhập tên: ");
            String name = sc.nextLine();
            System.out.print("Nhập giá bán: ");
            String price = sc.nextLine();
            System.out.print("Nhập thương hiệu: ");
            String brand = sc.nextLine();
            System.out.print("Nhập màu sắc: ");
            String color = sc.nextLine();
            System.out.print("Nhập chất liệu: ");
            String material = sc.nextLine();
            System.out.print("Nhập loại mực: ");
            String type = sc.nextLine();
            System.out.print("Nhập độ min: ");
            String smooth = sc.nextLine();
            pens.get(i-1).setName(name);
            pens.get(i-1).setPrice(price);
            pens.get(i-1).setBrand(brand);
            pens.get(i-1).setColor(color);
            pens.get(i-1).setMaterial(material);
            pens.get(i-1).setType(type);
            pens.get(i-1).setSmooth(smooth);
            System.out.println("Đã sửa bút.");
        }
        else
        {
            System.out.print("Nhập tên: ");
            String name = sc.nextLine();
            System.out.print("Nhập giá bán: ");
            String price = sc.nextLine();
            System.out.print("Nhập thương hiệu: ");
            String brand = sc.nextLine();
            System.out.print("Nhập màu sắc: ");
            String color = sc.nextLine();
            System.out.print("Nhập chất liệu: ");
            String material = sc.nextLine();
            System.out.print("Nhập độ cứng: ");
            String hardness = sc.nextLine();
            pencils.get(i-1).setName(name);
            pencils.get(i-1).setPrice(price);
            pencils.get(i-1).setBrand(brand);
            pencils.get(i-1).setColor(color);
            pencils.get(i-1).setMaterial(material);
            pencils.get(i-1).setHardness(hardness);
            System.out.println("Đã sửa bút chì.");
        }
    }
}
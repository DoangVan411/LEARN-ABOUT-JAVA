package Action;

import Products.*;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.max;
public class Guest {
    Scanner sc = new Scanner(System.in);

    public void guestAction()
    {
        System.out.println("Lựa chọn thao tác của khách: ");
        System.out.println("1.Tìm kiếm");
        System.out.println("2.Xem danh sách sản phẩm");
        System.out.println("3.Thoát về đăng nhập");
    }
    public void findItems(ArrayList<Book> books, ArrayList<NoteBook> notebooks, ArrayList<Pen> pens, ArrayList<Pencil> pencils)
    {
        System.out.print("Nhập thông tin cần tìm kiếm: ");
        String info = sc.nextLine();
        System.out.println("1. Xem dạng bảng");
        System.out.println("2.Xem dạng danh sách");
        System.out.print("Chọn chức năng hiển thị sản phẩm: ");
        int b = Integer.valueOf(sc.nextLine());
        if(b == 1)
        {
            int maxName = "Tên sản phẩm".length(), maxPrice = "Giá bán".length(), maxBrand = "Thương hiệu".length(), maxBonus = "Thông tin thêm".length();
            for(Book book: books)
            {
                if(book.getName().contains(info) == true || book.getPrice().contains(info) == true
                        || book.getBrand().contains(info) == true || book.getAuthor().contains(info) == true
                        || book.getGenre().contains(info) == true || book.getLanguage().contains(info) == true
                        || book.getPublish().contains(info) == true|| book.getPublisher().contains(info) == true)
                {
                    maxName = max(maxName, book.getName().length());
                    maxPrice = max(maxPrice, book.getPrice().length());
                    maxBrand = max(maxBrand, book.getBrand().length());
                    maxBonus = max(((book.getGenre() + "- The loai: ").length()),  maxBonus);
                    maxBonus = max((book.getPublisher() + "- Nha xuan ban: ").length(), maxBonus);
                    maxBonus = max((book.getPublish() + "- Nam xuan ban: ").length(), maxBonus);
                    maxBonus = max((book.getLanguage() + "- Ngon ngu: ").length(), maxBonus);
                }
            }
            for(NoteBook notebook: notebooks)
            {
                if(notebook.getName().contains(info) == true || notebook.getPrice().contains(info) == true
                   || notebook.getBrand().contains(info) == true || notebook.getType().contains(info) == true
                   || notebook.getSize().contains(info) == true || notebook.getColor().contains(info) == true
                   || notebook.getPages().contains(info) == true || notebook.getMaterial().contains(info) == true)
                {
                    maxName = max(maxName, notebook.getName().length());
                    maxPrice = max(maxPrice, notebook.getPrice().length());
                    maxBrand = max(maxBrand, notebook.getBrand().length());
                    maxBonus = max(((notebook.getColor() + "- Mau sac bia: ").length()),  maxBonus);
                    maxBonus = max((notebook.getMaterial() + "- Chat lieu giay: ").length(), maxBonus);
                    maxBonus = max((notebook.getSize() + "- Kich thuoc: ").length(), maxBonus);
                    maxBonus = max((notebook.getType() + "- Loai vo: ").length(), maxBonus);
                    maxBonus = max((notebook.getPages() + "- So trang: ").length(), maxBonus);
                }
            }
            for(Pen pen: pens)
            {
                if(pen.getName().contains(info) == true || pen.getPrice().contains(info) == true
                        || pen.getBrand().contains(info) == true || pen.getType().contains(info) == true
                        || pen.getMaterial().contains(info) == true || pen.getColor().contains(info) == true
                        || pen.getSmooth().contains(info) == true)
                {
                    maxName = max(maxName, pen.getName().length());
                    maxPrice = max(maxPrice, pen.getPrice().length());
                    maxBrand = max(maxBrand, pen.getBrand().length());
                    maxBonus = max(((pen.getColor() + "- Mau sac: ").length()),  maxBonus);
                    maxBonus = max((pen.getMaterial() + "- Chat lieu: ").length(), maxBonus);
                    maxBonus = max((pen.getSmooth() + "- Do min: ").length(), maxBonus);
                    maxBonus = max((pen.getType() + "- Loai muc: ").length(), maxBonus);
                }
            }
            for(Pencil pencil: pencils)
            {
                if(pencil.getName().contains(info) == true || pencil.getPrice().contains(info) == true
                        || pencil.getBrand().contains(info) == true || pencil.getColor().contains(info) == true
                        || pencil.getMaterial().contains(info) == true || pencil.getHardness().contains(info) == true)
                {
                    maxName = max(maxName, pencil.getName().length());
                    maxPrice = max(maxPrice, pencil.getPrice().length());
                    maxBrand = max(maxBrand, pencil.getBrand().length());
                    maxBonus = max(((pencil.getColor() + "- Mau sac: ").length()),  maxBonus);
                    maxBonus = max((pencil.getMaterial() + "- Chat lieu: ").length(), maxBonus);
                    maxBonus = max((pencil.getHardness() + "- Do cung: ").length(), maxBonus);
                }
            }
            System.out.println(String.format("%-" + maxName + "s" + " | " + "%-" + maxPrice + "s" + " | " + "%-" + maxBrand + "s" + " | "
                    ,"Tên sản phẩm","Giá bán","Thương hiệu","Thông tin thêm"));
            System.out.println("----------------------------------------------------------------------------");
            for(Book book: books)
            {
                if(book.getName().contains(info) == true || book.getPrice().contains(info) == true
                        || book.getBrand().contains(info) == true || book.getAuthor().contains(info) == true
                        || book.getGenre().contains(info) == true || book.getLanguage().contains(info) == true
                        || book.getPublish().contains(info) == true || book.getPublisher().contains(info) == true)
                {
                    System.out.print(String.format("%-" + maxName + "s" + " | " + "%-" + maxPrice + "s" + " | " + "%-" +
                            maxBrand + "s" + " | ", book.getName(), book.getPrice(), book.getBrand()));
                    System.out.println(String.format("- Thể loại: %-" + maxBonus + "s", book.getGenre() ));
                    System.out.println(String.format("%-" + maxName + "s" + " | " + "%-" + maxPrice + "s" + " | " + "%-" + maxBrand + "s" + " | "
                            + "- Tác giả: %-" + maxBonus + "s","","","", book.getAuthor()));
                    System.out.println(String.format("%-"+maxName+"s"+ " | " + "%-"+maxPrice+"s" + " | " + "%-"+maxBrand+"s" + " | "
                            + "- Nhà xuất bản: %-"+maxBonus+"s","","","",book.getPublisher()));
                    System.out.println(String.format("%-"+maxName+"s"+ " | " + "%-"+maxPrice+"s" + " | " + "%-"+maxBrand+"s" + " | "
                            + "- Năm xuất bản: %-"+maxBonus+"s","","","",book.getPublish()));
                    System.out.println(String.format("%-"+maxName+"s"+ " | " + "%-"+maxPrice+"s" + " | " + "%-"+maxBrand+"s" + " | "
                            + "- Ngôn ngữ: %-"+maxBonus+"s","","","",book.getLanguage()));
                    System.out.println("----------------------------------------------------------------------------");
                }
            }
            for(NoteBook notebook: notebooks)
            {
                if(notebook.getName().contains(info) == true || notebook.getPrice().contains(info) == true
                        || notebook.getBrand().contains(info) == true || notebook.getType().contains(info) == true
                        || notebook.getSize().contains(info) == true || notebook.getColor().contains(info) == true
                        || notebook.getPages().contains(info) == true || notebook.getMaterial().contains(info) == true)
                {
                    System.out.print(String.format("%-" + maxName + "s" + " | " + "%-" + maxPrice + "s" + " | " + "%-" +
                            maxBrand + "s" + " | ", notebook.getName(), notebook.getPrice(), notebook.getBrand()));
                    System.out.println(String.format("- Số trang: %-" + maxBonus + "s", notebook.getType() ));
                    System.out.println(String.format("%-" + maxName + "s" + " | " + "%-" + maxPrice + "s" + " | " + "%-" + maxBrand + "s" + " | "
                            + "- Loại vở: %-" + maxBonus + "s","","","","",notebook.getType()));
                    System.out.println(String.format("%-"+maxName+"s"+ " | " + "%-"+maxPrice+"s" + " | " + "%-"+maxBrand+"s" + " | "
                            + "- Màu sắc bìa: %-"+maxBonus+"s","","","",notebook.getColor()));
                    System.out.println(String.format("%-"+maxName+"s"+ " | " + "%-"+maxPrice+"s" + " | " + "%-"+maxBrand+"s" + " | "
                            + "- Chất liệu giấy: %-"+maxBonus+"s","","","",notebook.getMaterial()));
                    System.out.println(String.format("%-"+maxName+"s"+ " | " + "%-"+maxPrice+"s" + " | " + "%-"+maxBrand+"s" + " | "
                            + "- Kích thước: %-"+maxBonus+"s","","","",notebook.getSize()));
                    System.out.println("----------------------------------------------------------------------------");

                }
            }
            for(Pen pen: pens)
            {
                if(pen.getName().contains(info) == true || pen.getPrice().contains(info) == true
                        || pen.getBrand().contains(info) == true || pen.getType().contains(info) == true
                        || pen.getMaterial().contains(info) == true || pen.getColor().contains(info) == true
                        || pen.getSmooth().contains(info) == true)
                {
                    System.out.print(String.format("%-" + maxName + "s" + " | " + "%-" + maxPrice + "s" + " | " + "%-" + maxBrand + "s" + " | ",
                            pen.getName(), pen.getPrice(), pen.getBrand()));
                    System.out.println(String.format("- Màu sắc: %-" + maxBonus + "s", pen.getColor() ));
                    System.out.println(String.format("%-"+maxName+"s"+ " | " + "%-" + maxPrice + "s" + " | " + "%-"+maxBrand + "s" + " | "
                            + "- Chất liệu: %-"+maxBonus+"s","","","",pen.getMaterial()));
                    System.out.println(String.format("%-"+maxName+"s"+ " | " + "%-" + maxPrice + "s" + " | " + "%-" + maxBrand+"s" + " | "
                            + "- Loại mực: %-"+maxBonus+"s","","","",pen.getType()));
                    System.out.println(String.format("%-"+maxName+"s"+ " | " + "%-"+maxPrice+"s" + " | " + "%-"+maxBrand+"s" + " | "
                            + "- Độ mịn: %-"+maxBonus+"s","","","",pen.getSmooth()));
                    System.out.println("----------------------------------------------------------------------------");

                }
            }
            for(Pencil pencil: pencils)
            {
                if(pencil.getName().contains(info) == true || pencil.getPrice().contains(info) == true
                        || pencil.getBrand().contains(info) == true || pencil.getColor().contains(info) == true
                        || pencil.getMaterial().contains(info) == true || pencil.getHardness().contains(info) == true)
                {
                    System.out.print(String.format("%-" + maxName + "s" + " | " + "%-" + maxPrice + "s" + " | " + "%-" + maxBrand + "s" + " | ",
                            pencil.getName(), pencil.getPrice(), pencil.getBrand()));
                    System.out.println(String.format("- Màu sắc: %-" + maxBonus + "s", pencil.getColor() ));
                    System.out.println(String.format("%-"+maxName+"s"+ " | " + "%-"+maxPrice+"s" + " | " + "%-"+maxBrand+"s" + " | "
                            + "- Chất liệu: %-"+maxBonus+"s","","","",pencil.getMaterial()));
                    System.out.println(String.format("%-"+maxName+"s"+ " | " + "%-"+maxPrice+"s" + " | " + "%-"+maxBrand+"s" + " | "
                            + "- Độ cứng: %-"+maxBonus+"s","","","",pencil.getHardness()));
                    System.out.println("----------------------------------------------------------------------------");
                }
            }
        }
        else
        {
            for(int i = 0; i < books.size(); ++i)
            {
                if (books.get(i).getName().contains(info) == true
                    || books.get(i).getAuthor().contains(info) == true
                    || books.get(i).getGenre().contains(info) == true
                    || books.get(i).getPublish().contains(info) == true
                    || books.get(i).getPublisher().contains(info) == true
                    || books.get(i).getLanguage().contains(info) == true
                    || books.get(i).getBrand().contains(info) == true
                    || books.get(i).getPrice().contains(info) == true) {
                    System.out.println("Tên sản phẩm: " +  books.get(i).getName());
                    System.out.println("Giá bán: " + books.get(i).getPrice());
                    System.out.println("Thương hiệu: " + books.get(i).getBrand());
                    System.out.println("Thể loại: " + books.get(i).getGenre());
                    System.out.println("Tác giả: " + books.get(i).getAuthor());
                    System.out.println("Nhà xuất bản: " + books.get(i).getPublisher());
                    System.out.println("Năm xuất bản: " + books.get(i).getPublish());
                    System.out.println("Ngôn ngữ: " + books.get(i).getLanguage());
                    System.out.println("------");
                }
            }
            for(int i = 0; i < notebooks.size(); ++i)
            {
                if (notebooks.get(i).getName().contains(info) == true || notebooks.get(i).getPrice().contains(info) == true
                        || notebooks.get(i).getPages().contains(info) == true || notebooks.get(i).getColor().contains(info) == true
                        || notebooks.get(i).getMaterial().contains(info) == true || notebooks.get(i).getSize().contains(info) == true
                        || notebooks.get(i).getBrand().contains(info) == true || notebooks.get(i).getType().contains(info) == true) {
                    System.out.println("Tên sản phẩm: " +  notebooks.get(i).getName());
                    System.out.println("Giá bán: " + notebooks.get(i).getPrice());
                    System.out.println("Thương hiệu: " + notebooks.get(i).getBrand());
                    System.out.println("Số trang: " + notebooks.get(i).getPages());
                    System.out.println("Loại vở: " + notebooks.get(i).getType());
                    System.out.println("Màu sắc bìa: " + notebooks.get(i).getColor());
                    System.out.println("Chất liệu giấy: " + notebooks.get(i).getMaterial());
                    System.out.println("Kích thước: " + notebooks.get(i).getSize());
                    System.out.println("------");
                }
            }
            for(int i = 0; i < pencils.size(); ++i)
            {
                if (pencils.get(i).getName().contains(info) == true || pencils.get(i).getPrice().contains(info) == true
                        || pencils.get(i).getBrand().contains(info) == true || pencils.get(i).getColor().contains(info) == true
                        || pencils.get(i).getMaterial().contains(info) == true || pencils.get(i).getHardness().contains(info) == true) {
                    System.out.println("Tên sản phẩm: " +  pencils.get(i).getName());
                    System.out.println("Giá bán: " + pencils.get(i).getPrice());
                    System.out.println("Thương hiệu: " + pencils.get(i).getBrand());
                    System.out.println("Màu sắc: " + pencils.get(i).getColor());
                    System.out.println("Chất liệu: " + pencils.get(i).getMaterial());
                    System.out.println("Độ cứng: " + pencils.get(i).getHardness());
                    System.out.println("------");
                }
            }
            for(int i = 0; i < pens.size(); ++i)
            {
                if (pens.get(i).getName().contains(info) == true || pens.get(i).getType().contains(info) == true
                        || pens.get(i).getPrice().contains(info) == true || pens.get(i).getBrand().contains(info) == true
                        || pens.get(i).getColor().contains(info) == true || pens.get(i).getMaterial().contains(info) == true
                        || pens.get(i).getSmooth().contains(info) == true) {
                    System.out.println("Tên sản phẩm: " +  pens.get(i).getName());
                    System.out.println("Giá bán: " + pens.get(i).getPrice());
                    System.out.println("Thương hiệu: " + pens.get(i).getBrand());
                    System.out.println("Màu sắc: " + pens.get(i).getColor());
                    System.out.println("Chất liệu: " + pens.get(i).getMaterial());
                    System.out.println("Loại mực" + pens.get(i).getType());
                    System.out.println("Độ mịn: " + pens.get(i).getSmooth());
                    System.out.println("------");
                }
            }
        }
    }

    public void showListItems(ArrayList<Book> books, ArrayList<NoteBook> notebooks, ArrayList<Pen> pens, ArrayList<Pencil> pencils)
    {
        for(int i = 0; i < books.size(); ++i)
        {
            System.out.println("Tên sản phẩm: " +  books.get(i).getName());
            System.out.println("Giá bán: " + books.get(i).getPrice());
            System.out.println("Thương hiệu: " + books.get(i).getBrand());
            System.out.println("Thể loại: " + books.get(i).getGenre());
            System.out.println("Tác giả: " + books.get(i).getAuthor());
            System.out.println("Nhà xuất bản: " + books.get(i).getPublisher());
            System.out.println("Năm xuất bản: " + books.get(i).getPublish());
            System.out.println("Ngôn ngữ: " + books.get(i).getLanguage());
            System.out.println("------");
        }
        for(int i = 0; i < notebooks.size(); ++i)
        {
            System.out.println("Tên sản phẩm: " +  notebooks.get(i).getName());
            System.out.println("Giá bán: " + notebooks.get(i).getPrice());
            System.out.println("Thương hiệu: " + notebooks.get(i).getBrand());
            System.out.println("Số trang: " + notebooks.get(i).getPages());
            System.out.println("Loại vở: " + notebooks.get(i).getType());
            System.out.println("Màu sắc bìa: " + notebooks.get(i).getColor());
            System.out.println("Chất liệu giấy: " + notebooks.get(i).getMaterial());
            System.out.println("Kích thước: " + notebooks.get(i).getSize());
            System.out.println("------");
        }
        for(int i = 0; i < pens.size(); ++i)
        {
            System.out.println("Tên sản phẩm: " +  pens.get(i).getName());
            System.out.println("Giá bán: " + pens.get(i).getPrice());
            System.out.println("Thương hiệu: " + pens.get(i).getBrand());
            System.out.println("Màu sắc: " + pens.get(i).getColor());
            System.out.println("Chất liệu: " + pens.get(i).getMaterial());
            System.out.println("Loại mực" + pens.get(i).getType());
            System.out.println("Độ mịn: " + pens.get(i).getSmooth());
            System.out.println("------");
        }
        for(int i = 0; i < pencils.size(); ++i)
        {
            System.out.println("Tên sản phẩm: " +  pencils.get(i).getName());
            System.out.println("Giá bán: " + pencils.get(i).getPrice());
            System.out.println("Thương hiệu: " + pencils.get(i).getBrand());
            System.out.println("Màu sắc: " + pencils.get(i).getColor());
            System.out.println("Chất liệu: " + pencils.get(i).getMaterial());
            System.out.println("Độ cứng: " + pencils.get(i).getHardness());
            System.out.println("------");
        }
    }

}

import org.hibernate.Session;
import org.hibernate.SessionFactory;

//import DTO.KhachHangDTO;
public class TestHibernate {

    public static void main(String[] args) {
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();

        /*
         * Trong Hibernate, khi thực hiện một thao tác chèn dữ liệu thì bắt buộc phải mở
         * Transaction
         */
        session.getTransaction().begin();

        DTO.KhachHangDTO kh = new DTO.KhachHangDTO();
        kh.setSDTKHString("0987654321");
        kh.settenKHString("Loc");

        session.persist(kh);

        session.getTransaction().commit();

    }
}

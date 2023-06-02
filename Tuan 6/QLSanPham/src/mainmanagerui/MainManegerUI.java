
package mainmanagerui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList; 
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
public class MainManegerUI extends JFrame {
    private static final long serialVersionUID = 1L;
    private static JList lstCate;
    private JTable tblProduct;
    private DefaultTableModel dtmProduct;
    private JButton btnCateRemove,btnCateNew,btnCateUpdate,btnNew,btnSave,btnRemove;
    private JTextField txtId,txtName,txtUnitprice,txtQuantity;
    private JTextArea txtDescription;
    private static JComboBox cboCateList;
    JMenuBar menubar;
    JMenu mnuFile;
    JMenuItem mnuFileOpenDataFromDisk,mnuFileWritetodisk,mnuFileExit;
    public static ListCategory listData;
    public static Category selectedCate;
    public MainManegerUI(String title)
    {
        super(title);
        listData = new ListCategory();
    }
    public void doShow()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 550);
        addControl();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void addMenu()
    {
        menubar=newJMenuBar();
        mnuFile=newJMenu("File");
        mnuFileWritetodisk = new JMenuItem("Write Data to disk");
        mnuFileOpenDataFromDisk = new JMenuItem("Open Data from disk");
        mnuFileExit = new JMenuItem("Exit");
        menubar.add(mnuFile);
        mnuFile.add(mnuFileWritetodisk);
        mnuFile.add(mnuFileOpenDataFromDisk);
        mnuFile.addSeparator();
        mnuFile.add(mnuFileExit);
        setJMenuBar(menubar);
    }
    public void addControl()
    {
        addMenu();
        JPanel pnBorder =new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth=new JPanel();
        JLabel lblTitle=new JLabel("Quản lý sản phẩm");
        Font ftTitle=new Font("arial", Font.BOLD, 32);
        lblTitle.setFont(ftTitle);
        lblTitle.setForeground(Color.BLUE);
        pnNorth.add(lblTitle);pnBorder.add(pnNorth,BorderLayout.NORTH);
        JPanel pnListCate=new JPanel();
        JPanel pnListProduct=new JPanel();
        JSplitPane slitPane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pnListCate, pnListProduct);
        pnBorder.add(slitPane,BorderLayout.CENTER);
        pnListCate.setLayout(new BorderLayout());
        lstCate=new JList();
        TitledBorder cateborder=new TitledBorder(BorderFactory.createLineBorder(Color.RED), "Danh mục sản phẩm");
        lstCate.setBorder(cateborder);
        pnListCate.setPreferredSize(new Dimension(300, 0));
        pnListCate.add(lstCate,BorderLayout.CENTER);
        JPanel pnListCateSouth=new JPanel();
        btnCateNew =new JButton("New");
        Component add = pnListCateSouth.add(btnCateNew);
        btnCateUpdate =new JButton("Update");
        pnListCateSouth.add(btnCateUpdate);
        btnCateRemove = new JButton("Remove");
        pnListCateSouth.add(btnCateRemove);
        pnListCate.add(pnListCateSouth,BorderLayout.SOUTH);
        pnListProduct.setLayout(new BorderLayout());
        JPanel pnProductTitle=new JPanel();
        JLabel lblProductTitle=new JLabel("Thông tin chi tiết");
        pnProductTitle.add(lblProductTitle);
        pnListProduct.add(pnProductTitle,BorderLayout.NORTH);
        JPanel pnProductTable=new JPanel();
        pnProductTable.setLayout(new BorderLayout());
        pnListProduct.add(pnProductTable,BorderLayout.CENTER);
        dtmProduct =new DefaultTableModel();
        dtmProduct.addColumn("Product ID");
        dtmProduct.addColumn("Product Name");
        dtmProduct.addColumn("UnitPrice");
        dtmProduct.addColumn("Quantity");
        dtmProduct.addColumn("Description");
        tblProduct=new JTable(dtmProduct);
        JScrollPane sctblproduct=new JScrollPane(tblProduct );
        pnProductTable.add(sctblproduct,BorderLayout.CENTER);
        JPanel pnProductDetail=new JPanel();
        pnListProduct.add(pnProductDetail,BorderLayout.SOUTH);
        pnProductDetail.setLayout(new BoxLayout(pnProductDetail, BoxLayout.Y_AXIS));
        JPanel pnCateList=new JPanel();
        JLabel lblCateId=new JLabel("Category :");
        

    }

    private JMenuBar newJMenuBar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private JMenu newJMenu(String file) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}

    

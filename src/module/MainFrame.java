/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author mac
 */
public class MainFrame extends javax.swing.JFrame {

//    public Integer MaKH;
//    private String active = "home";
//    NhanVienDao dao = new NhanVienDao();
//    private String gender;
//    private boolean position;
//    int index = 0;
//    JFileChooser chooser = new JFileChooser();
//    NguoiHocDAO daoLearner = new NguoiHocDAO();
//    ChuyenDeDao daoThematic = new ChuyenDeDao();
//    KhoaHocDAO daoCourse = new KhoaHocDAO();
//    HocVienDAO daoStudents = new HocVienDAO();
//    ThongKeDAO daoGeneral = new ThongKeDAO();
//    NhanVien nhanVien = new NhanVien();
//    String edgPage = "";

    //Path
    private static String FILE_PATH = "";

    private static String FILE_PATHPDF = "";

    //We are making use of a single instance to prevent multiple write access to same file.
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        JTableHeader header = tblcourse.getTableHeader();
        header.setPreferredSize(new Dimension(25, 25));
//        choice();
//        //Load Employee
//        load();
//        setIconImage(ShareHelper.APP_ICON);
//        btnUpdateAdmin.setEnabled(false);
//        btnDeleteAdmin1.setEnabled(false);
//        //Load Learnner
//        this.loadLearner();
//        btnUpdateLearner.setEnabled(false);
//        btnDeleteLearner.setEnabled(false);
//        //Load Thematic
//        this.loadThematic();
//        btnUpdateThematic.setEnabled(false);
//        btnDeleteThematic.setEnabled(false);
//        //Load Course
//        this.fillComboBox();
//        this.loadCourse();
//        this.clearCourse();
//        this.setStatusCourse(false);
//        btnUpdateCourse.setEnabled(false);
//        btnDeleteCourse.setEnabled(false);
//        btnStudentCourse.setEnabled(false);
//        //Load Students
//        Integer id = Integer.valueOf(cboChuyenDe.getToolTipText());
//        this.MaKH = id;
//        //load General Statistics
//
//        fillComboBoxKhoaHoc();
//        fillComboBoxNam();
//
//        // load user
//        lblHello.setText("<html>" + "Hello :" + "<br>" + ShareHelper.USER.getHoTen() + "<html/>");
//        lblUSer.setToolTipText("Chuc vu :" + ShareHelper.USER.isVaiTro() + "\n" + "Hinh anh:" + ShareHelper.USER.getHinh() + "\n" + "Ma Nhan Vien:" + ShareHelper.USER.getMaNV());
//    }
//
////  -------------------------------In put excel---------------->
//    void SelectPathToPrint() {
//        JFileChooser fChooser = new JFileChooser();
//        int result = fChooser.showOpenDialog(null);
//        if (result == JFileChooser.APPROVE_OPTION) {
//            File fname = fChooser.getSelectedFile();
//            FILE_PATH = fname.getPath();
//            try {
//                List<NguoiHoc> list = daoLearner.select();
//                writeStudentsListToExcel(list);
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
//
//    public void writeStudentsListToExcel(List<NguoiHoc> studentList) {
//        // Using XSSF for xlsx format, for xls use HSSF
//        Workbook workbook = new XSSFWorkbook();
//
//        Sheet studentsSheet = workbook.createSheet("Learnner");
//
//        TableModel model = tblLearner.getModel();
//        int rowIndex1 = 0;
//        Row row2 = studentsSheet.createRow(rowIndex1++);
//        int cellIndex1 = 0;
//        row2.createCell(cellIndex1++).setCellValue(model.getColumnName(0));
//        row2.createCell(cellIndex1++).setCellValue(model.getColumnName(1));
//        row2.createCell(cellIndex1++).setCellValue(model.getColumnName(2));
//        row2.createCell(cellIndex1++).setCellValue(model.getColumnName(3));
//        row2.createCell(cellIndex1++).setCellValue(model.getColumnName(4));
//        row2.createCell(cellIndex1++).setCellValue(model.getColumnName(5));
//        row2.createCell(cellIndex1++).setCellValue(model.getColumnName(6));
//        row2.createCell(cellIndex1++).setCellValue(model.getColumnName(7));
//        row2.createCell(cellIndex1++).setCellValue(model.getColumnName(8));
//        row2.createCell(cellIndex1++).setCellValue(model.getColumnName(9));
//        int rowIndex = 1;
//        for (NguoiHoc hv : studentList) {
//            Row row = studentsSheet.createRow(rowIndex++);
//            int cellIndex = 0;
//            //first place in row is name
//            row.createCell(cellIndex++).setCellValue(hv.getMaNH());
//            //second place in row is marks in maths
//            row.createCell(cellIndex++).setCellValue(hv.getHoTen());
//            //third place in row is marks in Science
//            row.createCell(cellIndex++).setCellValue(hv.isGioiTinh());
//            row.createCell(cellIndex++).setCellValue(hv.getNgaySinh());
//            row.createCell(cellIndex++).setCellValue(hv.getDienThoai());
//            row.createCell(cellIndex++).setCellValue(hv.getEmail());
//            //fourth place in row is marks in English
//            row.createCell(cellIndex++).setCellValue(hv.getGhiChu());
//            row.createCell(cellIndex++).setCellValue(hv.getHinh());
//            row.createCell(cellIndex++).setCellValue(hv.getMaNV());
//            row.createCell(cellIndex++).setCellValue(hv.getNgayDK());
//        }
//
//        //write this workbook in excel file.
//        try {
//            FileOutputStream fos = new FileOutputStream(FILE_PATH);
//            workbook.write(fos);
//            fos.close();
//            System.out.println(FILE_PATH + " is successfully written");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public void writeLearnerToPDF(List<NguoiHoc> studentList) {
//        Document document = new Document();
//        try {
//            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(FILE_PATHPDF));
//            document.open();
//            document.add(new Paragraph("Learner Manager"));
//            PdfPTable table = new PdfPTable(10);
//            table.setWidthPercentage(105);
//            table.setSpacingBefore(11f);
//            table.setSpacingAfter(11f);
//            float[] colWidth = {2f, 2f, 2f, 2f, 2f, 2f, 2f, 2f, 2f, 2f};
//            table.setWidths(colWidth);
//            PdfPCell c1 = new PdfPCell(new Paragraph("Learner ID"));
//            PdfPCell c2 = new PdfPCell(new Paragraph("Name"));
//            PdfPCell c3 = new PdfPCell(new Paragraph("Gender"));
//            PdfPCell c4 = new PdfPCell(new Paragraph("BirthDay"));
//            PdfPCell c5 = new PdfPCell(new Paragraph("Email"));
//            PdfPCell c6 = new PdfPCell(new Paragraph("Phone"));
//            PdfPCell c7 = new PdfPCell(new Paragraph("Note"));
//            PdfPCell c8 = new PdfPCell(new Paragraph("Images"));
//            PdfPCell c9 = new PdfPCell(new Paragraph("LearnerID"));
//            PdfPCell c10 = new PdfPCell(new Paragraph("NgayDK"));
//            table.addCell(c1);
//            table.addCell(c2);
//            table.addCell(c3);
//            table.addCell(c4);
//            table.addCell(c5);
//            table.addCell(c6);
//            table.addCell(c7);
//            table.addCell(c8);
//            table.addCell(c9);
//            table.addCell(c10);
//            for (NguoiHoc nguoiHoc : studentList) {
//                PdfPCell c11 = new PdfPCell(new Paragraph(nguoiHoc.getMaNH()));
//                PdfPCell c12 = new PdfPCell(new Paragraph(nguoiHoc.getHoTen()));
//                PdfPCell c13 = new PdfPCell(new Paragraph(Boolean.toString(nguoiHoc.isGioiTinh())));
//                PdfPCell c14 = new PdfPCell(new Paragraph(nguoiHoc.getNgaySinh().toString()));
//                PdfPCell c15 = new PdfPCell(new Paragraph(nguoiHoc.getEmail()));
//                PdfPCell c16 = new PdfPCell(new Paragraph(nguoiHoc.getDienThoai()));
//                PdfPCell c17 = new PdfPCell(new Paragraph(nguoiHoc.getGhiChu()));
//                PdfPCell c18 = new PdfPCell(new Paragraph(nguoiHoc.getHinh()));
//                PdfPCell c19 = new PdfPCell(new Paragraph(nguoiHoc.getMaNV()));
//                PdfPCell c20 = new PdfPCell(new Paragraph(nguoiHoc.getNgayDK().toString()));
//                table.addCell(c11);
//                table.addCell(c12);
//                table.addCell(c13);
//                table.addCell(c14);
//                table.addCell(c15);
//                table.addCell(c16);
//                table.addCell(c17);
//                table.addCell(c18);
//                table.addCell(c19);
//                table.addCell(c20);
//
//            }
//            document.add(table);
//
//            document.close();
//            writer.close();
//
//        } catch (DocumentException | FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//    void SelectPathToPrintPDF() {
//        JFileChooser fChooser = new JFileChooser();
//        int result = fChooser.showOpenDialog(null);
//        if (result == JFileChooser.APPROVE_OPTION) {
//            File fname = fChooser.getSelectedFile();
//            FILE_PATHPDF = fname.getPath();
//            try {
//                List<NguoiHoc> list = daoLearner.select();
//                writeLearnerToPDF(list);
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
//
////        --------------------------CheckEmployee-----------------
//    public boolean checkDelete() {
//        boolean ok = true;
//        String ID = ShareHelper.USER.getMaNV();
//        if (ID.equals(txtEmployID.getText())) {
//            DialogHelper.alert(panelEmployee, "Error: Do not Delete yourself!");
//            ok = false;
//        }
//        boolean vaitro = ShareHelper.USER.isVaiTro();
//        if (vaitro == false) {
//            DialogHelper.alert(panelEmployee, "Error: Just admin can delete!");
//            ok = false;
//        }
//        return ok;
//    }
//
//    public boolean checkBeforeSave() {
//        String id = txtEmployID.getText();
//        String Pasword = txtPassword.getText();
//        String Reenterpassword = txtReEnterPassword.getText();
//        String name = txtNameEmployee.getText();
//        Icon image = lblImages.getIcon();
//        StringBuilder error = new StringBuilder();
//        NhanVienDao dao = new NhanVienDao();
//        boolean ok = true;
//
//        if (dao.findById(id) != null) {
//            String str6 = "ID alredy exits ,";
//            error.append(str6);
//            txtEmployID.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        if (id.equals("")) {
//            String str1 = "ID box has no data yet! ,";
//            error.append(str1);
//            txtEmployID.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//
//        if (Pasword.equals("")) {
//            String str2 = "Pssword box has no data yet! <br>";
//            error.append(str2);
//            txtPassword.setBackground(new Color(255, 102, 102));
//            ok = false;
//        } //checkBirthDay
//        if (Reenterpassword.equals("")) {
//            String str3 = "Re Enter Password box has no data yet! ,";
//            error.append(str3);
//
//            txtReEnterPassword.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        if (!Pasword.equals(Reenterpassword)) {
//            String str4 = "Password doesn't match! ,";
//            error.append(str4);
//            txtPassword.setBackground(new Color(255, 102, 102));
//            txtReEnterPassword.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        if (name.equals("")) {
//            String str5 = "Name box has no data yet! <br>";
//            error.append(str5);
//            txtNameEmployee.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        if (name.matches(".*[A-Za-z].*") == false) {
//            String str5 = "The name have to contains the alphabet character! ,";
//            error.append(str5);
//            txtNameEmployee.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        if (image == null) {
//            String str6 = "Images hasn't data ,";
//            error.append(str6);
//            lblImages.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        lblThongbao.setText("<html> Error: <br> " + error.toString() + "<html/>");
//        return ok;
//    }
//
//    public void choice() {
//        cboPositon.add("Manager");
//        cboPositon.add("Employees");
//    }
//
//    //Load Employee
//    void load() {
//        DefaultTableModel model = (DefaultTableModel) tblAdminManager.getModel();
//        model.setRowCount(0);
//        try {
//            List<NhanVien> list = dao.select();
//            for (NhanVien nv : list) {
//                Object[] row = {
//                    nv.getMaNV(),
//                    nv.getMatKhau(),
//                    nv.getHoTen(),
//                    nv.isGioiTinh() ? "Male" : "Female",
//                    nv.isVaiTro() ? "Manager" : "Employees",
//                    nv.getHinh()
//                };
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(panelEmployee, "Error querying data");
//        }
//    }
//    //Insert Employee
//
//    void insert() {
//        NhanVien model = getModel();
//        String confirm = new String(txtReEnterPassword.getPassword());
//        if (confirm.equals(model.getMatKhau())) {
//            try {
//                dao.insert(model);
//                this.load();
//                this.clear();
//                JOptionPane.showMessageDialog(panelEmployee, "Add new success!");
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(panelEmployee, "ID  already exists!!" + e.getMessage());
//            }
//        } else {
//            DialogHelper.alert(panelEmployee, "Password was wrong!");
//        }
//    }
//    //Update Employee
//
//    void update() {
//        NhanVien model = getModel();
//        String confirm = new String(txtReEnterPassword.getPassword());
//        if (!confirm.equals(model.getMatKhau())) {
//            JOptionPane.showMessageDialog(panelEmployee, "Password was wrong!");
//        } else {
//            try {
//                dao.update(model);
//                this.load();
//                JOptionPane.showMessageDialog(panelEmployee, "Update successful!");
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(panelEmployee, "Update Failure!");
//            }
//        }
//    }
////Delete employee
//
//    void delete() {
//        if (DialogHelper.confirm(this, "Do you really want to delete this employee?")) {
//            String manv = txtEmployID.getText();
//            try {
//                dao.delete(manv);
//                this.load();
//                this.clear();
//                DialogHelper.alert(panelEmployee, "Delete successfully!");
//            } catch (Exception e) {
//                DialogHelper.alert(panelEmployee, "Delete failure!");
//            }
//        }
//    }
//    //Clear Employee
//
//    void clear() {
//        txtEmployID.setText("");
//        txtPassword.setText("");
//        txtReEnterPassword.setText("");
//        txtNameEmployee.setText("");
//        lblImages.setIcon(null);
//        btnUpdateAdmin.setEnabled(false);
//        btnDeleteCourse.setEnabled(false);
//    }
//
//    //Edit Employee
//    void edit() {
//        try {
//            String manv = (String) tblAdminManager.getValueAt(this.index, 0);
//            NhanVien model = dao.findById(manv);
//            if (model != null) {
//                this.setModel(model);
//                this.setStatus(false);
//            }
//        } catch (Exception e) {
//            DialogHelper.alert(panelEmployee, "Error querying data");
//        }
//    }
//
//    //Setmodel Employee
//    void setModel(NhanVien model) {
//        txtEmployID.setText(model.getMaNV());
//        txtReEnterPassword.setText(model.getHoTen());
//        txtReEnterPassword.setText(model.getMatKhau());
//        if (model.isGioiTinh() == true) {
//            rdMale.setSelected(true);
//        } else {
//            rdFemale.setSelected(false);
//        }
//        if (model.isVaiTro()) {
//            cboPositon.select("Manager");
//
//        } else {
//            cboPositon.select("Employees");
//        }
//
//    }
//    //getmodel Employee
//
//    NhanVien getModel() {
//        NhanVien model = new NhanVien();
//        model.setMaNV(txtEmployID.getText());
//        model.setHoTen(txtNameEmployee.getText());
//        model.setMatKhau(new String(txtPassword.getPassword()));
//        if (rdMale.isSelected()) {
//            gender = "0";
//        } else {
//            gender = "1";
//        }
//        model.setGioiTinh(Boolean.parseBoolean(gender));
//        if (cboPositon.getSelectedItem().equals("Manager")) {
//            position = true;
//
//        } else {
//            position = false;
//        }
//        model.setVaiTro(position);
//        model.setHinh(lblImages.getToolTipText());
//        return model;
//    }
//    //setStatus Employee
//
//    void setStatus(boolean insertable) {
//        txtEmployID.setEditable(insertable);
//        btnAddAdmin.setEnabled(insertable);
//        btnNewAdmin.setEnabled(!insertable);
//        btnDeleteAdmin1.setEnabled(!insertable);
//        boolean first = this.index > 0;
//        boolean last = this.index < tblAdminManager.getRowCount() - 1;
//    }
//
//    void selectImage() {
//        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
//            File file = chooser.getSelectedFile();
//            if (ShareHelper.saveLogo(file)) {
////        // Hiển thị hình lên form 
//                lblImages.setIcon(ShareHelper.readLogo(file.getName()));
//                lblImages.setToolTipText(file.getName());
//            }
//        }
//    }

//    // -----------------------Check Learner ---------------------
//    public boolean checkBeforeSaveLearner() {
//        String id = txtLearnnerID.getText();
//        String Name = txtLearnerName.getText();
//        String BirthDay = txtLearnerBirthDay.getText();
//        String phone = txtLearnerPhone.getText();
//        String Email = txtLearnerEmail.getText();
//        String Note = txtLearnerNote.getText();
//        Icon image = lblLearnerImages.getIcon();
//        Pattern pattern = Pattern.compile("^[0-9]*$");
//        Matcher matcher = pattern.matcher(phone);
//        StringBuilder error = new StringBuilder();
//        boolean ok = true;
//        //
//        try {
//            if (daoLearner.findById(id) != null) {
//                String str6 = "ID alredy exits ,";
//                error.append(str6);
//                txtLearnnerID.setBackground(new Color(255, 102, 102));
//                ok = false;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        if (id.equals("")) {
//            String str1 = "ID box has no data yet!  ,";
//            error.append(str1);
//            txtLearnnerID.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        if (id.length() != 7) {
//            String str1 = " ID 7-character code! ,";
//            error.append(str1);
//            txtLearnnerID.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        if (Name.equals("")) {
//            String str2 = "Name box has no data yet!  <br>";
//            error.append(str2);
//            txtLearnerName.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        if (Name.matches(".*[A-Za-z].*") == false) {
//            String str5 = "The name have to contains the alphabet character! ,";
//            error.append(str5);
//            txtLearnerName.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//
//        try {
//            Date Ngay = DateHelper.toDate(BirthDay, "yyyy-MM-dd");
//        } catch (Exception e) {
//            String str3 = "The birth date is not the correct format! ,";
//            error.append(str3);
//            txtLearnerBirthDay.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//
//        try {
//            String BirtDay = txtLearnerBirthDay.getText();
//            LocalDate localDateKG = LocalDate.parse(BirtDay);
//            Calendar now = Calendar.getInstance();
//            now = Calendar.getInstance();
//            now.add(Calendar.YEAR, -16);
//            System.out.println(BirtDay);
//            String date = now.get(Calendar.YEAR) + "-0" + now.get(Calendar.MONTH) + "-" + now.get(Calendar.DATE);
//            LocalDate localDateKG1 = LocalDate.parse(date);
//            System.out.println(date);
//            if (localDateKG.compareTo(localDateKG1) > 0) {
//                String str4 = "Age have to >16!  <br>";
//                error.append(str4);
//                txtLearnerBirthDay.setBackground(new Color(255, 102, 102));
//                ok = false;
//            }
//        } catch (Exception e) {
//            String str3 = " date is not the correct format! ," + e.getMessage();
//            System.out.println(e.getMessage());
//            error.append(str3);
//            txtLearnerBirthDay.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//
//        if (!matcher.matches()) {
//            String str7 = "The input string is not a number! ,";
//            error.append(str7);
//            txtLearnerPhone.setBackground(new Color(255, 102, 102));
//            ok = false;
//        } else if (phone.length() == 10 || phone.length() == 11) {
//            if (phone.length() == 10) {
//                if (!phone.substring(0, 2).equals("09")) {
//                    String str7 = ("Invalid phone number: Phone number includes 10 - 11<br> numbers and starts from 09-01<br>");
//                    error.append(str7);
//                    txtLearnerPhone.setBackground(new Color(255, 102, 102));
//                    ok = false;
//                }
//            } else if (!phone.substring(0, 2).equals("01")) {
//                String str7 = ("Invalid phone number: Phone number includes<br> 10 - 11 numbers and starts from 09-01<br>");
//                error.append(str7);
//                txtLearnerPhone.setBackground(new Color(255, 102, 102));
//                ok = false;
//            }
//        } else {
//            String str7 = ("Invalid phone number: Phone number includes 10 - 11 <br> numbers and starts from 09-01<br>");
//            error.append(str7);
//            txtLearnerPhone.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//
//        if (!Email.matches("\\w+@\\w+(\\.\\w+){1,2}")) {
//            String str5 = "Email incorrect format!  ,";
//            error.append(str5);
//            txtLearnerEmail.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//
//        if (Note.equals("")) {
//            String str6 = "Do not put in notes! ,";
//            error.append(str6);
//            txtLearnerNote.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        if (image == null) {
//            String str6 = "Images hasn't data  ,";
//            error.append(str6);
//            lblLearnerImages.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        lblThongbaoLearner.setText("<html>error  :  <br>" + error.toString() + "<html/>");
//        return ok;
//
//    }
//
//////    <-- Learner -->
//    void loadLearner() {
//        DefaultTableModel model = (DefaultTableModel) tblLearner.getModel();
//        model.setRowCount(0);
//        try {
//            String keyword = txtFindID.getText();
//            List<NguoiHoc> list = daoLearner.selectByKeyword(keyword);
//            for (NguoiHoc nh : list) {
//                Object[] row = {
//                    nh.getMaNH(),
//                    nh.getHoTen(),
//                    nh.isGioiTinh() ? "Male" : "Female",
//                    DateHelper.toString(nh.getNgaySinh()),
//                    nh.getDienThoai(),
//                    nh.getEmail(),
//                    nh.getGhiChu(),
//                    nh.getHinh(),
//                    nh.getMaNV(),
//                    DateHelper.toString(nh.getNgayDK())
//                };
//
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            DialogHelper.alert(panelLearner, "Error querying data!");
//        }
//    }
//
//    //Update Learner
//    void updateLearner() throws ParseException {
//        NguoiHoc modelNguoihoc = getModelLearner();
//        try {
//            daoLearner.update(modelNguoihoc);
//            this.loadLearner();
//            DialogHelper.alert(panelLearner, "Update Success!");
//        } catch (Exception e) {
//            DialogHelper.alert(this, "Update Failed" + e.getMessage());
//        }
//    }
//    //Delete Learner
//
//    void deleteLearner() {
//        if (DialogHelper.confirm(panelLearner, "Do you really want to delete this Learner?")) {
//            String manh = txtLearnnerID.getText();
//            try {
//                daoLearner.delete(manh);
//                this.loadLearner();
//                this.clearLearner();
//                DialogHelper.alert(panelLearner, "Delete Success!");
//            } catch (HeadlessException e) {
//                DialogHelper.alert(panelLearner, "Delete failed!");
//            }
//        }
//    }
//
//    //Edit Learner
//    void editLearner() {
//        try {
//            String manh = (String) tblLearner.getValueAt(this.index, 0);
//            NguoiHoc model = daoLearner.findById(manh);
//            if (model != null) {
//                this.setModelLearner(model);
//                this.setStatusLearner(false);
//            }
//        } catch (Exception e) {
//            DialogHelper.alert(panelLearner, "Error querying data!");
//        }
//    }
//
//    // Insert Learner
//    void insertLearner() {
//        try {
//            NguoiHoc modelNguoihoc = getModelLearner();
//            daoLearner.insert(modelNguoihoc);
//            this.loadLearner();
//            this.clearLearner();
//            DialogHelper.alert(panelLearner, "Add new success!");
//        } catch (Exception e) {
//            DialogHelper.alert(panelLearner, "ID is alredy exits");
//        }
//    }
//
//    //Clear Learner
//    void clearLearner() {
//        NguoiHoc modelNguoiHoc = new NguoiHoc();
//        modelNguoiHoc.setMaNV(ShareHelper.USER.getMaNV());
//        modelNguoiHoc.setNgayDK(DateHelper.now());
//        this.setModelLearner(modelNguoiHoc);
//        btnUpdateLearner.setEnabled(false);
//        btnDeleteLearner.setEnabled(false);
//    }
//
//    //setModel Learner
//    void setModelLearner(NguoiHoc model) {
//        txtLearnnerID.setText(model.getMaNH());
//        txtLearnerName.setText(model.getHoTen());
//        if (model.isGioiTinh() == true) {
//            rdMale.setSelected(true);
//        } else {
//            rdFemale.setSelected(false);
//        }
//        txtLearnerBirthDay.setText(DateHelper.toString(model.getNgaySinh()));
//        txtLearnerPhone.setText(model.getDienThoai());
//        txtLearnerEmail.setText(model.getEmail());
//        txtLearnerNote.setText(model.getGhiChu());
//        lblLearnerImages.setToolTipText(model.getHinh());
//        if (model.getHinh() != null) {
//            lblLearnerImages.setIcon(ShareHelper.readLogo(model.getHinh()));
//        }
//    }
//
//    //GetmodelLearner
//    NguoiHoc getModelLearner() throws ParseException {
//        NguoiHoc model = new NguoiHoc();
//        model.setMaNH(txtLearnnerID.getText());
//        model.setHoTen(txtLearnerName.getText());
//        if (rdLearnerMale.isSelected()) {
//            gender = "0";
//        } else {
//            gender = "1";
//        }
//        model.setGioiTinh(Boolean.parseBoolean(gender));
//        model.setNgaySinh(DateHelper.toDate(txtLearnerBirthDay.getText()));
//        model.setDienThoai(txtLearnerPhone.getText());
//        model.setEmail(txtLearnerEmail.getText());
//        model.setGhiChu(txtLearnerNote.getText());
//        model.setHinh(lblLearnerImages.getToolTipText());
//        model.setMaNV(ShareHelper.USER.getMaNV());
//        model.setNgayDK(DateHelper.now());
//        return model;
//    }
//
//    void selectImageLearner() {
//        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
//            File file = chooser.getSelectedFile();
//            if (ShareHelper.saveLogo(file)) {
////        // Hiển thị hình lên form 
//                lblLearnerImages.setIcon(ShareHelper.readLogo(file.getName()));
//                lblLearnerImages.setToolTipText(file.getName());
//            }
//        }
//    }
//
//    //SetStatusLearner
//    void setStatusLearner(boolean insertable) {
//        txtLearnnerID.setEditable(insertable);
//        btnAddLearner.setEnabled(insertable);
//        btnUpdateLearner.setEnabled(!insertable);
//        btnDeleteLearner.setEnabled(!insertable);
//        boolean first = this.index > 0;
//        boolean last = this.index < tblLearner.getRowCount() - 1;
//    }
//
////    <------------------------Thematic Manager-------------------------------->\
//    public boolean checkBeforeSaveThematics() {
//        String id = txtThematicID.getText();
//        String Name = txtThematicName.getText();
//        String description = txtThematicDescribe.getText();
//        Icon image = lblThematicImages.getIcon();
//        StringBuilder error = new StringBuilder();
//        boolean ok = true;
//        //
//        try {
//            if (daoThematic.findById(id) != null) {
//                String str6 = "ID alredy exits ,";
//                error.append(str6);
//                txtThematicID.setBackground(new Color(255, 102, 102));
//                ok = false;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        if (id.equals("")) {
//            String str1 = "ID box has no data yet!  ,";
//            error.append(str1);
//            txtThematicID.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        if (id.length() != 5) {
//            String str1 = "5-character code! ,";
//            error.append(str1);
//            txtThematicID.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        if (Name.equals("")) {
//            String str2 = "Name box has no data yet! ,";
//            error.append(str2);
//            txtThematicName.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        if (Name.matches(".*[A-Za-z].*") == false) {
//            String str5 = "The name have to contains the alphabet character! <br>";
//            error.append(str5);
//            txtThematicName.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        try {
//            double tuition = Double.parseDouble(txtThematicTuition.getText());
//            if (tuition < 0) {
//                String str6 = "Tuition have to  > 0 ,";
//                error.append(str6);
//                txtThematicTuition.setBackground(new Color(255, 102, 102));
//                ok = false;
//            }
//        } catch (NumberFormatException e) {
//            String str6 = "Tuition is not number? ,";
//            error.append(str6);
//            txtThematicTuition.setBackground(new Color(255, 102, 102));
//            ok = false;
//
//        }
//        try {
//            int time = Integer.parseInt(txtThematicTime.getText());
//            if (time < 0) {
//                String str6 = "Time have to  >= 0 ,";
//                error.append(str6);
//                txtThematicTime.setBackground(new Color(255, 102, 102));
//                ok = false;
//            }
//        } catch (NumberFormatException e) {
//            String str6 = "Time is not number? ,";
//            error.append(str6);
//            txtThematicTime.setBackground(new Color(255, 102, 102));
//            ok = false;
//
//        }
//
//        if (description.equals("")) {
//            String str6 = "Do not put in notes! <br>";
//            error.append(str6);
//            txtThematicDescribe.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        if (image == null) {
//            String str6 = "Images hasn't data  ,";
//            error.append(str6);
//            lblThematicImages.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        lblThongbaoThematic.setText("<html>error  :  <br>" + error.toString() + "<html/>");
//        return ok;
//
//    }
//
//    void loadThematic() {
//        DefaultTableModel model = (DefaultTableModel) tblThematic.getModel();
//        model.setRowCount(0);
//        try {
//            List<ChuyenDe> list = daoThematic.select();
//            for (ChuyenDe cd : list) {
//                Object[] row = {
//                    cd.getMaCD(), cd.getTenCD(), cd.getHocPhi(), cd.getThoiLuong(), cd.getHinh(), cd.getMoTa()
//                };
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            DialogHelper.alert(panelThematic, e.getMessage());
//        }
//    }
//
//    void insertThematic() {
//        ChuyenDe model = getModelThematic();
//        try {
//            daoThematic.insert(model);
//            this.loadThematic();
//            this.clearThematic();
//            DialogHelper.alert(panelThematic, "Add new success!");
//        } catch (Exception e) {
//            DialogHelper.alert(panelThematic, "Add new failure!" + e.getMessage());
//        }
//    }
//
//    void editThematic() {
//        try {
//            String macd = (String) tblThematic.getValueAt(this.index, 0);
//            ChuyenDe model = daoThematic.findById(macd);
//            if (model != null) {
//                this.setModelThematic(model);
//                this.setStatusThematic(false);
//            }
//        } catch (Exception e) {
//            DialogHelper.alert(panelThematic, "Error querying data!" + e.getMessage());
//        }
//    }
//
//    void deleteThematic() {
//        if (DialogHelper.confirm(panelThematic, "Do you want to delete or not?")) {
//            String macd = txtThematicID.getText();
//            try {
//                daoThematic.delete(macd);
//                this.loadThematic();
//                this.clearThematic();
//                DialogHelper.alert(panelThematic, "Delete success!");
//            } catch (Exception e) {
//                DialogHelper.alert(panelThematic, "Delete failure!");
//            }
//        }
//    }
//
//    void clearThematic() {
//        this.setModelThematic(new ChuyenDe());
//        this.setStatusThematic(true);
//        btnUpdateThematic.setEnabled(false);
//        btnDeleteThematic.setEnabled(false);
//        lblThongbaoThematic.setText("");
//    }
//
//    void updateThematic() {
//        ChuyenDe model = getModelThematic();
//        try {
//            daoThematic.update(model);
//            this.loadThematic();
//            DialogHelper.alert(panelThematic, "Update successful!");
//        } catch (Exception e) {
//            DialogHelper.alert(panelThematic, "Update failed!" + e.getMessage());
//        }
//    }
//
//    void setModelThematic(ChuyenDe model) {
//        txtThematicID.setText(model.getMaCD());
//        txtThematicName.setText(model.getTenCD());
//        txtThematicTime.setText(String.valueOf(model.getThoiLuong()));
//        txtThematicTuition.setText(String.valueOf(model.getHocPhi()));
//        txtThematicDescribe.setText(model.getMoTa());
//        lblThematicImages.setToolTipText(model.getHinh());
//        if (model.getHinh() != null) {
//            lblThematicImages.setIcon(ShareHelper.readLogo(model.getHinh()));
//        }
//    }
//
//    ChuyenDe getModelThematic() {
//        ChuyenDe model = new ChuyenDe();
//        model.setMaCD(txtThematicID.getText());
//        model.setTenCD(txtThematicName.getText());
//        model.setThoiLuong(Integer.valueOf(txtThematicTime.getText()));
//        model.setHocPhi(Double.valueOf(txtThematicTuition.getText()));
//        model.setHinh(lblThematicImages.getToolTipText());
//        model.setMoTa(txtThematicDescribe.getText());
//        return model;
//    }
//
//    void setStatusThematic(boolean insertable) {
//        txtThematicID.setEditable(insertable);
//        btnAddThematic.setEnabled(insertable);
//        btnUpdateThematic.setEnabled(!insertable);
//        btnDeleteThematic.setEnabled(!insertable);
//        boolean first = this.index > 0;
//        boolean last = this.index < tblThematic.getRowCount() - 1;
//    }
//
//    void selectImageThematic() {
//        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
//            File file = chooser.getSelectedFile();
//            if (ShareHelper.saveLogo(file)) {
////        // Hiển thị hình lên form 
//                lblThematicImages.setIcon(ShareHelper.readLogo(file.getName()));
//                lblThematicImages.setToolTipText(file.getName());
//            }
//        }
//    }
//
//    //    <------------------------Course Manager-------------------------------->\
//    public boolean checkBeforeSaveCourse() {
//
//        String dateOpen = txtCourseOpening.getText();
//        String name = txtCourseCreator.getText();
//        String description = txtCourseNote.getText();
//
//        StringBuilder error = new StringBuilder();
//        boolean ok = true;
//        //check openday
//        try {
//            Date Ngay = DateHelper.toDate(dateOpen, "yyyy-MM-dd");
//
//        } catch (Exception e) {
//            String str3 = " date is not the correct format!,";
//            error.append(str3);
//            txtCourseOpening.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        //Check tuition
//        try {
//            double tuition = Double.parseDouble(txtCourseTuition.getText());
//            if (tuition < 0) {
//                String str6 = "Tuition have to  > 0 ,";
//                error.append(str6);
//                txtCourseTuition.setBackground(new Color(255, 102, 102));
//                ok = false;
//            }
//        } catch (NumberFormatException e) {
//            String str6 = "Tuition is not number? ,";
//            error.append(str6);
//            txtCourseTuition.setBackground(new Color(255, 102, 102));
//            ok = false;
//
//        }
//        try {
//            int time = Integer.parseInt(txtCourseTime.getText());
//            if (time < 0) {
//                String str6 = "Time have to  >= 0 ,";
//                error.append(str6);
//                txtCourseTime.setBackground(new Color(255, 102, 102));
//                ok = false;
//            }
//        } catch (NumberFormatException e) {
//            String str6 = "Time is not number? ,";
//            error.append(str6);
//            txtCourseTime.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        //check Name
//        if (name.matches(".*[A-Za-z].*") == false) {
//            String str5 = "The name have to contains the alphabet character! <br>";
//            error.append(str5);
//            txtCourseCreator.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        //check ngay KG
//        try {
//            String dateKG = txtCoursedateCreated.getText();
////            Date Ngay = DateHelper.toDate(dateKG, "yyyy-MM-dd");
//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//            LocalDate localDateKG = LocalDate.parse(dateKG);
//            LocalDate localDateNow = LocalDate.now();
//            System.out.println(localDateKG);
//            System.out.println(localDateNow);
//            if (localDateKG.compareTo(localDateNow) <= 0) {
//                String str4 = " dateCreated have to > today!  ,";
//                error.append(str4);
//                txtCoursedateCreated.setBackground(new Color(255, 102, 102));
//                ok = false;
//            }
//        } catch (Exception e) {
//            String str3 = " date is not the correct format!  ,";
//            error.append(str3);
//            txtCoursedateCreated.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//        if (description.equals("")) {
//            String str6 = "Do not put in notes! ,";
//            error.append(str6);
//            txtCourseNote.setBackground(new Color(255, 102, 102));
//            ok = false;
//        }
//
//        lblThongbaoCourse.setText("<html>error  :  <br>" + error.toString() + "<html/>");
//        return ok;
//
//    }
//
//    void loadCourse() {
//        DefaultTableModel model = (DefaultTableModel) tblcourse.getModel();
//        model.setRowCount(0);
//        try {
//            List<KhoaHoc> list = daoCourse.select();
//            for (KhoaHoc kh : list) {
//                Object[] row = {
//                    kh.getMaKH(),
//                    kh.getMaCD(),
//                    kh.getThoiLuong(),
//                    kh.getHocPhi(), DateHelper.toString(kh.getNgayKG()),
//                    kh.getMaNV(),
//                    DateHelper.toString(kh.getNgayTao())
//                };
//                model.addRow(row);
//
//            }
//        } catch (Exception e) {
//            DialogHelper.alert(panelCourse, "Error querying data!" + e.getMessage());
//        }
//    }
//
//    void insertCourse() {
//        KhoaHoc model = getModelCourse();
//        model.setNgayTao(new Date());
//        try {
//            daoCourse.insert(model);
//            this.loadCourse();
//            this.clearCourse();
//            DialogHelper.alert(panelCourse, "Add new success!");
//        } catch (HeadlessException e) {
//            DialogHelper.alert(panelCourse, "New failed!" + e.getMessage());
//        }
//    }
//
//    void editCourse() {
//        try {
//            Integer makh = (Integer) tblcourse.getValueAt(this.index, 0);
//            KhoaHoc model = daoCourse.findById(makh);
//            JOptionPane.showMessageDialog(panelCourse, makh);
//            if (model != null) {
//                this.setModelCourse(model);
//
//                this.setStatusCourse(false);
//            }
//        } catch (Exception e) {
//            DialogHelper.alert(panelCourse, "Error querying data!" + e.getMessage());
//        }
//    }
//
//    void deleteCourse() {
//        if (DialogHelper.confirm(panelCourse, "Do you really want to delete this course?")) {
//            Integer makh = Integer.valueOf(cboChuyenDe.getToolTipText());
//            try {
//                daoCourse.delete(makh);
//                this.load();
//                this.clear();
//                DialogHelper.alert(panelCourse, "Delete success!");
//            } catch (Exception e) {
//                DialogHelper.alert(panelCourse, "Delete failure!" + e.getMessage());
//            }
//        }
//    }
//
//    void updateCourse() {
//        KhoaHoc model = getModelCourse();
//        try {
//            daoCourse.update(model);
//            this.loadCourse();
//            DialogHelper.alert(panelCourse, "Update successful!");
//        } catch (Exception e) {
//            DialogHelper.alert(panelCourse, "Update failed!" + e.getMessage());
//        }
//    }
//
//    void clearCourse() {
//        KhoaHoc model = new KhoaHoc();
//        ChuyenDe chuyenDe = (ChuyenDe) cboChuyenDe.getSelectedItem();
//        model.setMaCD(chuyenDe.getMaCD());
//        model.setMaNV(ShareHelper.USER.getMaNV());
//        model.setNgayKG(DateHelper.add(30));
//        model.setNgayTao(DateHelper.now());
//        this.setModelCourse(model);
//        btnUpdateCourse.setEnabled(false);
//        btnDeleteCourse.setEnabled(false);
//        lblThongbaoCourse.setText("");
//    }
//
//    KhoaHoc getModelCourse() {
//        KhoaHoc model = new KhoaHoc();
//        ChuyenDe chuyenDe = (ChuyenDe) cboChuyenDe.getSelectedItem();
//        model.setMaCD(chuyenDe.getMaCD());
//        model.setNgayKG(DateHelper.toDate(txtCourseOpening.getText()));
//        model.setHocPhi(Double.valueOf(txtCourseTuition.getText()));
//        model.setThoiLuong(Integer.valueOf(txtCourseTime.getText()));
//        model.setGhiChu(txtCourseNote.getText());
//        model.setMaNV(ShareHelper.USER.getMaNV());
//        model.setNgayTao(DateHelper.toDate(txtCoursedateCreated.getText()));
//        model.setMaKH(Integer.valueOf(cboChuyenDe.getToolTipText()));
//        return model;
//    }
//
//    void setModelCourse(KhoaHoc model) {
//        cboChuyenDe.setToolTipText(String.valueOf(model.getMaKH()));
//        cboChuyenDe.setSelectedItem(daoThematic.findById(model.getMaCD()));
//        txtCourseOpening.setText(DateHelper.toString(model.getNgayKG()));
//        txtCourseTuition.setText(String.valueOf(model.getHocPhi()));
//        txtCourseTime.setText(String.valueOf(model.getThoiLuong()));
//        txtCourseCreator.setText(model.getMaNV());
//        txtCoursedateCreated.setText(DateHelper.toString(model.getNgayTao()));
//        txtCourseNote.setText(model.getGhiChu());
//    }
//
//    void setStatusCourse(boolean insertable) {
//
//        btnUpdateCourse.setEnabled(!insertable);
//        btnDeleteCourse.setEnabled(!insertable);
//        boolean first = this.index > 0;
//        boolean last = this.index < tblcourse.getRowCount() - 1;
//
//    }
//
//    void selectComboBox() {
//        ChuyenDe chuyenDe = (ChuyenDe) cboChuyenDe.getSelectedItem();
//        txtCourseTime.setText(String.valueOf(chuyenDe.getThoiLuong()));
//        txtCourseTuition.setText(String.valueOf(chuyenDe.getHocPhi()));
//    }
//
//    void openHocVien() {
//        Integer id = Integer.valueOf(cboChuyenDe.getToolTipText());
//        new PanelStudent(id).setVisible(true);
//    }
//
////    void openHocVien() {
////        Integer id = Integer.valueOf(cboChuyenDe.getToolTipText());
////        
////        new HocVienJFrame(id).setVisible(true);
////    }
//    void fillComboBox() {
//        DefaultComboBoxModel model = (DefaultComboBoxModel) cboChuyenDe.getModel();
//        model.removeAllElements();
//        try {
//            List<ChuyenDe> list = daoThematic.select();
//            for (ChuyenDe cd : list) {
//                model.addElement(cd);
//            }
//        } catch (Exception e) {
//            DialogHelper.alert(panelCourse, "Error querying data!" + e.getMessage());
//        }
//    }
//
//    //    <------------------------General Statistics -------------------------------->\
//    void fillComboBoxKhoaHoc() {
//        DefaultComboBoxModel model = (DefaultComboBoxModel) cboCourse.getModel();
//        model.removeAllElements();
//        List<KhoaHoc> list = daoCourse.select();
//        for (KhoaHoc kh : list) {
//            int Makh1 = kh.getMaKH();
//            model.addElement(Makh1);
//        }
//        cboCourse.setSelectedIndex(0);
//    }
//
//    void fillComboBoxNam() {
//        DefaultComboBoxModel model = (DefaultComboBoxModel) cboYear.getModel();
//        model.removeAllElements();
//        List<KhoaHoc> list = daoCourse.select();
//        for (KhoaHoc kh : list) {
//            int nam = kh.getNgayKG().getYear() + 1900;
//            if (model.getIndexOf(nam) < 0) {
//                model.addElement(nam);
//            }
//        }
//        cboYear.setSelectedIndex(0);
//    }
//
//    void fillTableBangDiem() {
//        DefaultTableModel model = (DefaultTableModel) tblStudentMarkTable.getModel();
//        model.setRowCount(0);
//        int kh = (int) cboCourse.getSelectedItem();
//        System.out.println(kh);
//
//        List<Object[]> list = daoGeneral.getBangDiem(kh);
//        for (Object[] row : list) {
//            model.addRow(row);
//        }
//    }
//
//    void fillTableNguoiHoc() {
//        DefaultTableModel model = (DefaultTableModel) tblLearnerStatisticstable.getModel();
//        model.setRowCount(0);
//        List<Object[]> list = daoGeneral.getNguoiHoc();
//        for (Object[] row : list) {
//            model.addRow(row);
//        }
//    }
//
//    void fillTableKhoaHoc() {
//        DefaultTableModel model = (DefaultTableModel) tblSyntheticMarkTable.getModel();
//        model.setRowCount(0);
//        List<Object[]> list = daoGeneral.getDiemTheoChuyenDe();
//        for (Object[] row : list) {
//            model.addRow(row);
//        }
//    }
//
//    void fillTableDoanhThu() {
//        DefaultTableModel model = (DefaultTableModel) tblRevenueTable.getModel();
//        model.setRowCount(0);
//        int nam = Integer.parseInt(cboYear.getSelectedItem().toString());
//        List<Object[]> list = daoGeneral.getDoanhThu(nam);
//        for (Object[] row : list) {
//            model.addRow(row);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator28 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        bgPanel = new javax.swing.JPanel();
        SidePanel = new javax.swing.JPanel();
        btnHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        btnEmployee = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnlearner = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnThematic = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCourse = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnGenarlStatistics = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblHello = new javax.swing.JLabel();
        lblUSer = new javax.swing.JLabel();
        btnSettings = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rSPanelsSlider2 = new rojerusan.RSPanelsSlider();
        panelHome = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel63 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        PanelHelp = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel48 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        panelEmployee = new javax.swing.JPanel();
        tbPanel3 = new javax.swing.JTabbedPane();
        pnUpdate3 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        txtEmployID = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel51 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel53 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        txtNameEmployee = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        rdFemale = new javax.swing.JRadioButton();
        rdMale = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        lblImages = new javax.swing.JLabel();
        btnNewAdmin = new javax.swing.JButton();
        btnAddAdmin = new javax.swing.JButton();
        btnUpdateAdmin = new javax.swing.JButton();
        cboPositon = new java.awt.Choice();
        txtReEnterPassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        lblThongbao = new javax.swing.JLabel();
        pnList3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblAdminManager = new javax.swing.JTable();
        btnDeleteAdmin1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        panelLearner = new javax.swing.JPanel();
        tbPanel2 = new javax.swing.JTabbedPane();
        pnUpdate2 = new javax.swing.JPanel();
        rdLearnerFemale = new javax.swing.JRadioButton();
        rdLearnerMale = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        lblLearnerImages = new javax.swing.JLabel();
        btnNewLearner = new javax.swing.JButton();
        btnAddLearner = new javax.swing.JButton();
        btnUpdateLearner = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        txtLearnerName = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        txtLearnnerID = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        txtLearnerBirthDay = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        txtLearnerPhone = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        txtLearnerEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLearnerNote = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        lblThongbaoLearner = new javax.swing.JLabel();
        pnList2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLearner = new javax.swing.JTable();
        jSeparator19 = new javax.swing.JSeparator();
        btnDeleteLearner = new javax.swing.JButton();
        txtFindID = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();
        btnFindLearner = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        panelThematic = new javax.swing.JPanel();
        tbPanel1 = new javax.swing.JTabbedPane();
        pnUpdate1 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        txtThematicID = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        txtThematicName = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        txtThematicTuition = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        txtThematicTime = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblThematicImages = new javax.swing.JLabel();
        btnNewThematic = new javax.swing.JButton();
        btnAddThematic = new javax.swing.JButton();
        btnUpdateThematic = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtThematicDescribe = new javax.swing.JTextArea();
        lblThongbaoThematic = new javax.swing.JLabel();
        pnList1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblThematic = new javax.swing.JTable();
        btnDeleteThematic = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        panelCourse = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        pnUpdate = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtCourseOpening = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtCourseTuition = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtCourseCreator = new javax.swing.JTextField();
        btnNewCourse = new javax.swing.JButton();
        btnAddCourse = new javax.swing.JButton();
        btnUpdateCourse = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        txtCourseTime = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jSeparator27 = new javax.swing.JSeparator();
        txtCoursedateCreated = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtCourseNote = new javax.swing.JTextArea();
        cboChuyenDe = new javax.swing.JComboBox<>();
        btnStudentCourse = new javax.swing.JButton();
        lblThongbaoCourse = new javax.swing.JLabel();
        pnList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcourse = new javax.swing.JTable();
        btnDeleteCourse = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        panelGeneralStatistics = new javax.swing.JPanel();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        panelGeneralStatistics2 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        btnLearnerGeneral = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        btnTranscript = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        btnSynthetic = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        btnRevenue = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        panelLearnerStatistics = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblLearnerStatisticstable = new javax.swing.JTable();
        paneltableMarks = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblStudentMarkTable = new javax.swing.JTable();
        jLabel74 = new javax.swing.JLabel();
        cboCourse = new javax.swing.JComboBox<>();
        panelSyntheticPoint = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblSyntheticMarkTable = new javax.swing.JTable();
        panelRevenueTable = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblRevenueTable = new javax.swing.JTable();
        panelRevenueTable1 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblStudentMarkTable3 = new javax.swing.JTable();
        panelRevenueTable2 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblStudentMarkTable4 = new javax.swing.JTable();
        Year = new javax.swing.JLabel();
        cboYear = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();

        jPopupMenu1.setBackground(new java.awt.Color(54, 32, 89));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(85, 65, 118));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-login_rounded_right.png"))); // NOI18N
        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);
        jPopupMenu1.add(jSeparator2);

        jPopupMenu2.setBackground(new java.awt.Color(54, 32, 89));
        jPopupMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPopupMenu2MouseReleased(evt);
            }
        });

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setBackground(new java.awt.Color(85, 65, 118));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-matt_paper.png"))); // NOI18N
        jMenuItem3.setText("Print To ExCell");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem3);
        jPopupMenu2.add(jSeparator28);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setBackground(new java.awt.Color(85, 65, 118));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-separate_document.png"))); // NOI18N
        jMenuItem4.setText("Print To PDF");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bgPanel.setBackground(new java.awt.Color(255, 255, 255));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBackground(new java.awt.Color(54, 32, 89));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setBackground(new java.awt.Color(85, 65, 118));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHomeMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-a_home.png"))); // NOI18N

        lbl.setFont(new java.awt.Font("Silom", 0, 17)); // NOI18N
        lbl.setForeground(new java.awt.Color(255, 255, 255));
        lbl.setText("Home");

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addGroup(btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnHomeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnHomeLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SidePanel.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 270, -1));

        btnEmployee.setBackground(new java.awt.Color(85, 65, 118));
        btnEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEmployeeMousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-contacts.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Silom", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee Management ");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEmployeeLayout = new javax.swing.GroupLayout(btnEmployee);
        btnEmployee.setLayout(btnEmployeeLayout);
        btnEmployeeLayout.setHorizontalGroup(
            btnEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEmployeeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnEmployeeLayout.setVerticalGroup(
            btnEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEmployeeLayout.createSequentialGroup()
                .addGroup(btnEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnEmployeeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnEmployeeLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SidePanel.add(btnEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 270, 50));

        btnlearner.setBackground(new java.awt.Color(85, 65, 118));
        btnlearner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnlearnerMousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-student_registration.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Silom", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Learner Management ");

        javax.swing.GroupLayout btnlearnerLayout = new javax.swing.GroupLayout(btnlearner);
        btnlearner.setLayout(btnlearnerLayout);
        btnlearnerLayout.setHorizontalGroup(
            btnlearnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnlearnerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        btnlearnerLayout.setVerticalGroup(
            btnlearnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnlearnerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnlearnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SidePanel.add(btnlearner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 270, 50));

        btnThematic.setBackground(new java.awt.Color(85, 65, 118));
        btnThematic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThematicMousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-copybook.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Silom", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Thematic Management ");

        javax.swing.GroupLayout btnThematicLayout = new javax.swing.GroupLayout(btnThematic);
        btnThematic.setLayout(btnThematicLayout);
        btnThematicLayout.setHorizontalGroup(
            btnThematicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThematicLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnThematicLayout.setVerticalGroup(
            btnThematicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThematicLayout.createSequentialGroup()
                .addGroup(btnThematicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnThematicLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnThematicLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SidePanel.add(btnThematic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 270, -1));

        btnCourse.setBackground(new java.awt.Color(85, 65, 118));
        btnCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCourseMousePressed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-school.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Silom", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Course Management ");

        javax.swing.GroupLayout btnCourseLayout = new javax.swing.GroupLayout(btnCourse);
        btnCourse.setLayout(btnCourseLayout);
        btnCourseLayout.setHorizontalGroup(
            btnCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCourseLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        btnCourseLayout.setVerticalGroup(
            btnCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCourseLayout.createSequentialGroup()
                .addGroup(btnCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnCourseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnCourseLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SidePanel.add(btnCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 270, -1));

        btnGenarlStatistics.setBackground(new java.awt.Color(85, 65, 118));
        btnGenarlStatistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGenarlStatisticsMousePressed(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-about.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Silom", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("General Statistics ");

        javax.swing.GroupLayout btnGenarlStatisticsLayout = new javax.swing.GroupLayout(btnGenarlStatistics);
        btnGenarlStatistics.setLayout(btnGenarlStatisticsLayout);
        btnGenarlStatisticsLayout.setHorizontalGroup(
            btnGenarlStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGenarlStatisticsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        btnGenarlStatisticsLayout.setVerticalGroup(
            btnGenarlStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGenarlStatisticsLayout.createSequentialGroup()
                .addGroup(btnGenarlStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnGenarlStatisticsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnGenarlStatisticsLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SidePanel.add(btnGenarlStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 270, 50));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/jdk-8u211-macosx-x64.png"))); // NOI18N
        SidePanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, 270, 80));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        SidePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 20));

        lblHello.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblHello.setForeground(new java.awt.Color(204, 255, 255));
        lblHello.setText("<html>\n<body>\n<br>\n<body>\n</html>");
        SidePanel.add(lblHello, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 190, 50));

        lblUSer.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblUSer.setForeground(new java.awt.Color(204, 255, 255));
        lblUSer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUSerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUSerMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblUSerMouseReleased(evt);
            }
        });
        SidePanel.add(lblUSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 40, 50));

        btnSettings.setBackground(new java.awt.Color(85, 65, 118));
        btnSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSettingsMousePressed(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-help.png"))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Silom", 0, 15)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Help");

        javax.swing.GroupLayout btnSettingsLayout = new javax.swing.GroupLayout(btnSettings);
        btnSettings.setLayout(btnSettingsLayout);
        btnSettingsLayout.setHorizontalGroup(
            btnSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSettingsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        btnSettingsLayout.setVerticalGroup(
            btnSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSettingsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(14, 14, 14))
        );

        SidePanel.add(btnSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 270, 50));

        bgPanel.add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-minus_math.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        bgPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 30, 30));

        rSPanelsSlider2.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelsSlider2.setNextFocusableComponent(panelLearner);

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setName("panelHome"); // NOI18N
        panelHome.setPreferredSize(new java.awt.Dimension(668, 520));
        panelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(122, 72, 220));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Times", 0, 28)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 255, 255));
        jLabel31.setText(" FPT Polytechnic");
        jPanel11.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 200, -1));
        jPanel11.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));
        jPanel11.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 350, -1));

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(204, 255, 255));
        jLabel63.setText("Administration/Funding/ by");
        jPanel11.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        panelHome.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 670, 110));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("We ❤ FPT Polytechnic");
        panelHome.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 0, -1, 33));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(204, 255, 255));
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/Bản sao anhMenu.png"))); // NOI18N

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(51, 51, 51));
        jLabel59.setText("<html>     <head>         <title>TODO supply a title</title>         <meta charset=\"UTF-8\">         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">     </head>     <body>         <h1>Log off employees</h1>         <p>\"Click right mouse\" to show user manager.\"</p>     </body> </html>");

        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(51, 51, 51));
        jLabel68.setText("<html>     <head>         <title>TODO supply a title</title>         <meta charset=\"UTF-8\">         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">     </head>     <body>         <h1>Edit Value in table</h1>         <p>\"Click right mouse on table \" to show value on textfield and turn on Button\"</p>     </body> </html>");

        jLabel76.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(204, 255, 255));
        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/anhtable.png"))); // NOI18N

        jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(204, 255, 255));
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/clickTable.png"))); // NOI18N

        jLabel78.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(51, 51, 51));
        jLabel78.setText("<html>     <head>         <title>TODO supply a title</title>         <meta charset=\"UTF-8\">         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">     </head>     <body>         <h1>Open the student management panel\n</h1>         <p>\"Click on the table to open the student manager\n\"</p>     </body> </html>");

        jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(204, 255, 255));
        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/ClickPanel.png"))); // NOI18N

        jLabel80.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(51, 51, 51));
        jLabel80.setText("<html>     <head>         <title>TODO supply a title</title>         <meta charset=\"UTF-8\">         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">     </head>     <body>         <h1>open statistical management\n</h1>         <p>\"Click on the button to see statistics management\"</p>     </body> </html>");

        jLabel81.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(204, 255, 255));
        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/BackButton.png"))); // NOI18N

        jLabel82.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(51, 51, 51));
        jLabel82.setText("<html>     <head>         <title>TODO supply a title</title>         <meta charset=\"UTF-8\">         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">     </head>     <body>         <h1>Back to statistics management\n</h1>         <p>\"\nClick to Back to statistics management\n\"</p>     </body> </html>");

        jLabel83.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(51, 51, 51));
        jLabel83.setText("<html>     <head>         <title>TODO supply a title</title>         <meta charset=\"UTF-8\">         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">     </head>     <body>         <h1>Login to System\n\n</h1>         <p>\"Use employee account to login\n.\"</p>     </body> </html>");

        jLabel84.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(204, 255, 255));
        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/Login.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78)
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel80))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelHome.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 162, 660, 360));

        rSPanelsSlider2.add(panelHome, "card2");

        PanelHelp.setBackground(new java.awt.Color(255, 255, 255));
        PanelHelp.setName("PanelHelp"); // NOI18N
        PanelHelp.setPreferredSize(new java.awt.Dimension(668, 520));

        jPanel3.setBackground(new java.awt.Color(122, 72, 220));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Times", 0, 28)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 255, 255));
        jLabel22.setText(" FPT Polytechnic");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 200, -1));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 350, -1));

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(204, 255, 255));
        jLabel48.setText("Administration/Funding/ by");
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("We ❤ FPT Polytechnic");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("<html>     <head>         <title>TODO supply a title</title>         <meta charset=\"UTF-8\">         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">              </head>         <body>             <h1>                       &nbsp;&nbsp;Polypro is a sample project. The main goal is to train students in the project implementation process.             </h1>             <p>&nbsp;&nbsp;&nbsp;The goal of this project is to train IO (CDIO) skills, which means students do not need to collect analysis but only implement and operate a software for the <br> upcoming project.<br> CD skills (in CDIO) will be practiced in Project 1 and Project 2.                 <br><br>                  &nbsp;&nbsp;&nbsp;&nbsp;Environmental requirements:<br>                 1. Any operating system.<br>                 2.JDK1.8 and above.<br>                 3.SQL Server 2008 and above<br>             </p>         </body>      </html>"); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelHelpLayout = new javax.swing.GroupLayout(PanelHelp);
        PanelHelp.setLayout(PanelHelpLayout);
        PanelHelpLayout.setHorizontalGroup(
            PanelHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHelpLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHelpLayout.createSequentialGroup()
                .addGroup(PanelHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelHelpLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelHelpLayout.setVerticalGroup(
            PanelHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHelpLayout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addGroup(PanelHelpLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        rSPanelsSlider2.add(PanelHelp, "card2");

        panelEmployee.setBackground(new java.awt.Color(255, 255, 255));
        panelEmployee.setName("panelEmployee"); // NOI18N

        tbPanel3.setForeground(new java.awt.Color(102, 102, 102));
        tbPanel3.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        tbPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbPanel3MousePressed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbPanel3MouseEntered(evt);
            }
        });

        pnUpdate3.setBackground(new java.awt.Color(255, 255, 255));
        pnUpdate3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setText("EmployeeID:");
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel47MouseExited(evt);
            }
        });
        pnUpdate3.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 32));
        pnUpdate3.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 220, 10));

        txtEmployID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEmployID.setBorder(null);
        pnUpdate3.add(txtEmployID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 230, 40));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 102, 102));
        jLabel50.setText("Password:");
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel50MouseExited(evt);
            }
        });
        pnUpdate3.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 32));
        pnUpdate3.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 220, 10));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 102, 102));
        jLabel51.setText("Re-enter password:");
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel51MouseExited(evt);
            }
        });
        pnUpdate3.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 32));
        pnUpdate3.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 220, 10));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 102, 102));
        jLabel53.setText("Name:");
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel53MouseExited(evt);
            }
        });
        pnUpdate3.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 32));
        pnUpdate3.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 220, 10));

        txtNameEmployee.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNameEmployee.setBorder(null);
        pnUpdate3.add(txtNameEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 220, 40));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 102, 102));
        jLabel55.setText("Name");
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel55MouseExited(evt);
            }
        });
        pnUpdate3.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 32));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(102, 102, 102));
        jLabel56.setText("Gender:");
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel56MouseExited(evt);
            }
        });
        pnUpdate3.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 32));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(102, 102, 102));
        jLabel57.setText("Positon:");
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel57MouseExited(evt);
            }
        });
        pnUpdate3.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 32));

        buttonGroup1.add(rdFemale);
        rdFemale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdFemale.setForeground(new java.awt.Color(102, 102, 102));
        rdFemale.setText("Female");
        pnUpdate3.add(rdFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        buttonGroup1.add(rdMale);
        rdMale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdMale.setForeground(new java.awt.Color(102, 102, 102));
        rdMale.setText("Male");
        pnUpdate3.add(rdMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setForeground(new java.awt.Color(153, 153, 153));

        lblImages.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblImages.setForeground(new java.awt.Color(250, 245, 245));
        lblImages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImagesMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblImagesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImages, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImages, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        pnUpdate3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 190, 200));

        btnNewAdmin.setBackground(new java.awt.Color(255, 255, 255));
        btnNewAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNewAdmin.setForeground(new java.awt.Color(102, 102, 102));
        btnNewAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-update_left_rotation.png"))); // NOI18N
        btnNewAdmin.setText("New");
        btnNewAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNewAdminMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewAdminMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewAdminMouseEntered(evt);
            }
        });
        btnNewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAdminActionPerformed(evt);
            }
        });
        pnUpdate3.add(btnNewAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, 40));

        btnAddAdmin.setBackground(new java.awt.Color(255, 255, 255));
        btnAddAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddAdmin.setForeground(new java.awt.Color(102, 102, 102));
        btnAddAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-add_user_male.png"))); // NOI18N
        btnAddAdmin.setText("add");
        btnAddAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddAdminMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddAdminMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddAdminMouseEntered(evt);
            }
        });
        btnAddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAdminActionPerformed(evt);
            }
        });
        pnUpdate3.add(btnAddAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 90, 40));

        btnUpdateAdmin.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdateAdmin.setForeground(new java.awt.Color(102, 102, 102));
        btnUpdateAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-downloading_updates.png"))); // NOI18N
        btnUpdateAdmin.setText("Update");
        btnUpdateAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpdateAdminMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateAdminMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateAdminMouseEntered(evt);
            }
        });
        btnUpdateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAdminActionPerformed(evt);
            }
        });
        pnUpdate3.add(btnUpdateAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 110, 40));

        cboPositon.setBackground(new java.awt.Color(255, 255, 255));
        cboPositon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboPositon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboPositon.setName(""); // NOI18N
        pnUpdate3.add(cboPositon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 200, 30));

        txtReEnterPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtReEnterPassword.setBorder(null);
        pnUpdate3.add(txtReEnterPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 220, 40));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        pnUpdate3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 220, 40));

        lblThongbao.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblThongbao.setForeground(new java.awt.Color(255, 102, 102));
        lblThongbao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThongbaoMouseExited(evt);
            }
        });
        pnUpdate3.add(lblThongbao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 350, 50));

        tbPanel3.addTab("Update", pnUpdate3);

        pnList3.setBackground(new java.awt.Color(255, 255, 255));
        pnList3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane6.setBorder(null);

        tblAdminManager.setAutoCreateRowSorter(true);
        tblAdminManager.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblAdminManager.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblAdminManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null},
                {"EP01", "Le Ngoc Hai", "123456", "male", "employee", null},
                {"EP02", "Nguyen Cao Bang", "123456", "female", "employee", null},
                {null, "", null, null, null, null}
            },
            new String [] {
                "EMPLOYEE.ID", "PASSWORD", "NAME", "GENDER", "POSITION", "IMAGES"
            }
        ));
        tblAdminManager.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblAdminManager.setRowHeight(20);
        tblAdminManager.setSelectionBackground(new java.awt.Color(30, 144, 255));
        tblAdminManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAdminManagerMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdminManagerMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblAdminManager);
        if (tblAdminManager.getColumnModel().getColumnCount() > 0) {
            tblAdminManager.getColumnModel().getColumn(4).setResizable(false);
        }

        pnList3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 650, 390));

        btnDeleteAdmin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-delete_trash_1.png"))); // NOI18N
        btnDeleteAdmin1.setText("Delete");
        btnDeleteAdmin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDeleteAdmin1MousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteAdmin1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteAdmin1MouseEntered(evt);
            }
        });
        pnList3.add(btnDeleteAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, 50));

        tbPanel3.addTab("List", pnList3);

        jPanel10.setBackground(new java.awt.Color(54, 32, 89));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(54, 32, 89));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel85.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(250, 245, 245));
        jLabel85.setText("Admin Manager ");
        jLabel85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel85MouseExited(evt);
            }
        });
        jPanel26.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 200, 50));

        jPanel10.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout panelEmployeeLayout = new javax.swing.GroupLayout(panelEmployee);
        panelEmployee.setLayout(panelEmployeeLayout);
        panelEmployeeLayout.setHorizontalGroup(
            panelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmployeeLayout.createSequentialGroup()
                .addGroup(panelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmployeeLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelEmployeeLayout.setVerticalGroup(
            panelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rSPanelsSlider2.add(panelEmployee, "card2");

        panelLearner.setBackground(new java.awt.Color(255, 255, 255));
        panelLearner.setName("panelLearner"); // NOI18N

        tbPanel2.setForeground(new java.awt.Color(102, 102, 102));
        tbPanel2.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        tbPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbPanel2MousePressed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbPanel2MouseEntered(evt);
            }
        });

        pnUpdate2.setBackground(new java.awt.Color(255, 255, 255));
        pnUpdate2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rdLearnerFemale);
        rdLearnerFemale.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rdLearnerFemale.setForeground(new java.awt.Color(102, 102, 102));
        rdLearnerFemale.setText("Female");
        pnUpdate2.add(rdLearnerFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        buttonGroup1.add(rdLearnerMale);
        rdLearnerMale.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rdLearnerMale.setForeground(new java.awt.Color(102, 102, 102));
        rdLearnerMale.setSelected(true);
        rdLearnerMale.setText("Male");
        pnUpdate2.add(rdLearnerMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setForeground(new java.awt.Color(153, 153, 153));

        lblLearnerImages.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLearnerImages.setForeground(new java.awt.Color(51, 0, 51));
        lblLearnerImages.setText("\"Click\" to choice Images");
        lblLearnerImages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLearnerImagesMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLearnerImagesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLearnerImages, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLearnerImages, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        pnUpdate2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 190, 200));

        btnNewLearner.setBackground(new java.awt.Color(255, 255, 255));
        btnNewLearner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNewLearner.setForeground(new java.awt.Color(102, 102, 102));
        btnNewLearner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-update_left_rotation.png"))); // NOI18N
        btnNewLearner.setText("New");
        btnNewLearner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNewLearnerMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewLearnerMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewLearnerMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewLearnerMouseEntered(evt);
            }
        });
        btnNewLearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewLearnerActionPerformed(evt);
            }
        });
        pnUpdate2.add(btnNewLearner, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, 40));

        btnAddLearner.setBackground(new java.awt.Color(255, 255, 255));
        btnAddLearner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddLearner.setForeground(new java.awt.Color(102, 102, 102));
        btnAddLearner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-add_user_male.png"))); // NOI18N
        btnAddLearner.setText("add");
        btnAddLearner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddLearnerMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddLearnerMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddLearnerMouseEntered(evt);
            }
        });
        btnAddLearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLearnerActionPerformed(evt);
            }
        });
        pnUpdate2.add(btnAddLearner, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 90, 40));

        btnUpdateLearner.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateLearner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdateLearner.setForeground(new java.awt.Color(102, 102, 102));
        btnUpdateLearner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-downloading_updates.png"))); // NOI18N
        btnUpdateLearner.setText("Update");
        btnUpdateLearner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpdateLearnerMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateLearnerMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateLearnerMouseEntered(evt);
            }
        });
        btnUpdateLearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateLearnerActionPerformed(evt);
            }
        });
        pnUpdate2.add(btnUpdateLearner, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 110, 40));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setText("Name:");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel36MouseExited(evt);
            }
        });
        pnUpdate2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 32));
        pnUpdate2.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 210, 10));

        txtLearnerName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtLearnerName.setBorder(null);
        pnUpdate2.add(txtLearnerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 210, 30));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setText("LearnerID:");
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel40MouseExited(evt);
            }
        });
        pnUpdate2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 32));
        pnUpdate2.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 210, 10));

        txtLearnnerID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtLearnnerID.setBorder(null);
        pnUpdate2.add(txtLearnnerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 220, 30));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setText("Gender");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel38MouseExited(evt);
            }
        });
        pnUpdate2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 32));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("BirthDay:");
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel37MouseExited(evt);
            }
        });
        pnUpdate2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 32));
        pnUpdate2.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 200, 10));

        txtLearnerBirthDay.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtLearnerBirthDay.setBorder(null);
        pnUpdate2.add(txtLearnerBirthDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 200, 30));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 102, 102));
        jLabel39.setText("Phone:");
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel39MouseExited(evt);
            }
        });
        pnUpdate2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 32));
        pnUpdate2.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 200, 10));

        txtLearnerPhone.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtLearnerPhone.setBorder(null);
        pnUpdate2.add(txtLearnerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 210, 30));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 102, 102));
        jLabel41.setText("Note:");
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel41MouseExited(evt);
            }
        });
        pnUpdate2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 32));
        pnUpdate2.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 200, 10));

        txtLearnerEmail.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtLearnerEmail.setBorder(null);
        pnUpdate2.add(txtLearnerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 220, 30));

        txtLearnerNote.setColumns(20);
        txtLearnerNote.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtLearnerNote.setRows(3);
        txtLearnerNote.setBorder(null);
        jScrollPane2.setViewportView(txtLearnerNote);

        pnUpdate2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 102, 102));
        jLabel42.setText("Email:");
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel42MouseExited(evt);
            }
        });
        pnUpdate2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 32));

        lblThongbaoLearner.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblThongbaoLearner.setForeground(new java.awt.Color(255, 102, 102));
        lblThongbaoLearner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThongbaoLearnerMouseExited(evt);
            }
        });
        pnUpdate2.add(lblThongbaoLearner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 610, 60));

        tbPanel2.addTab("Update", pnUpdate2);

        pnList2.setBackground(new java.awt.Color(255, 255, 255));
        pnList2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBorder(null);

        tblLearner.setAutoCreateRowSorter(true);
        tblLearner.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblLearner.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblLearner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null, null, null},
                {"EP01", "Le Ngoc Hai", "123456", "male", "employee", "hinh1.jpg", "xanh", "hinh2.png", null, null},
                {"EP02", "Nguyen Cao Bang", "123456", "female", "employee", "hinh2.jpg", "do", "hinh3.png", null, null},
                {null, "", null, null, null, null, null, null, null, null}
            },
            new String [] {
                "LEARNER.ID", "NAME", "GENDER", "BIRTHDAY", "PHONE", "EMAIL", "NOTE", "IMAGES", "LEARNER.ID", "NGAYDK"
            }
        ));
        tblLearner.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblLearner.setRowHeight(20);
        tblLearner.setSelectionBackground(new java.awt.Color(30, 144, 255));
        tblLearner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLearnerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblLearner);

        pnList2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 650, 390));
        pnList2.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 290, 10));

        btnDeleteLearner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-delete_trash_1.png"))); // NOI18N
        btnDeleteLearner.setText("Delete");
        btnDeleteLearner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDeleteLearnerMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDeleteLearnerMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteLearnerMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteLearnerMouseEntered(evt);
            }
        });
        pnList2.add(btnDeleteLearner, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, 50));

        txtFindID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFindID.setBorder(null);
        txtFindID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindIDActionPerformed(evt);
            }
        });
        pnList2.add(txtFindID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 310, 50));

        btnPrint.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-print.png"))); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPrintMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPrintMouseReleased(evt);
            }
        });
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        pnList2.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 50));

        btnFindLearner.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnFindLearner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-find_user_male.png"))); // NOI18N
        btnFindLearner.setText("Find");
        btnFindLearner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFindLearnerMousePressed(evt);
            }
        });
        btnFindLearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindLearnerActionPerformed(evt);
            }
        });
        pnList2.add(btnFindLearner, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 100, 50));

        tbPanel2.addTab("List", pnList2);

        jPanel7.setBackground(new java.awt.Color(54, 32, 89));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(254, 253, 253));
        jLabel54.setText("Learner Manager ");
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel54MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel54)
                .addGap(208, 208, 208))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLearnerLayout = new javax.swing.GroupLayout(panelLearner);
        panelLearner.setLayout(panelLearnerLayout);
        panelLearnerLayout.setHorizontalGroup(
            panelLearnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLearnerLayout.createSequentialGroup()
                .addGroup(panelLearnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLearnerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelLearnerLayout.setVerticalGroup(
            panelLearnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLearnerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rSPanelsSlider2.add(panelLearner, "card2");

        panelThematic.setBackground(new java.awt.Color(255, 255, 255));
        panelThematic.setName("panelThematic"); // NOI18N

        tbPanel1.setForeground(new java.awt.Color(102, 102, 102));
        tbPanel1.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        tbPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbPanel1MousePressed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbPanel1MouseEntered(evt);
            }
        });

        pnUpdate1.setBackground(new java.awt.Color(255, 255, 255));
        pnUpdate1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("Thematic.ID:");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel34MouseExited(evt);
            }
        });
        pnUpdate1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 32));
        pnUpdate1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 220, 10));

        txtThematicID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtThematicID.setBorder(null);
        txtThematicID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThematicIDActionPerformed(evt);
            }
        });
        pnUpdate1.add(txtThematicID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 230, 40));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("ThematicName:");
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel35MouseExited(evt);
            }
        });
        pnUpdate1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 32));
        pnUpdate1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 220, 10));

        txtThematicName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtThematicName.setBorder(null);
        pnUpdate1.add(txtThematicName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 220, 40));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 102, 102));
        jLabel43.setText("Tuition:");
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel43MouseExited(evt);
            }
        });
        pnUpdate1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 32));
        pnUpdate1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 220, 10));

        txtThematicTuition.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtThematicTuition.setBorder(null);
        pnUpdate1.add(txtThematicTuition, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 230, 40));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setText("Describe the topic :");
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel44MouseExited(evt);
            }
        });
        pnUpdate1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 32));
        pnUpdate1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 220, 10));

        txtThematicTime.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtThematicTime.setBorder(null);
        pnUpdate1.add(txtThematicTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 220, 40));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("Time:");
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel45MouseExited(evt);
            }
        });
        pnUpdate1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 32));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        lblThematicImages.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblThematicImages.setForeground(new java.awt.Color(253, 244, 244));
        lblThematicImages.setText("\"Click here\" to choice images ");
        lblThematicImages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblThematicImagesMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThematicImagesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThematicImages, javax.swing.GroupLayout.PREFERRED_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThematicImages, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pnUpdate1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 190, 180));

        btnNewThematic.setBackground(new java.awt.Color(255, 255, 255));
        btnNewThematic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNewThematic.setForeground(new java.awt.Color(102, 102, 102));
        btnNewThematic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-update_left_rotation.png"))); // NOI18N
        btnNewThematic.setText("New");
        btnNewThematic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNewThematicMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewThematicMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewThematicMouseEntered(evt);
            }
        });
        btnNewThematic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewThematicActionPerformed(evt);
            }
        });
        pnUpdate1.add(btnNewThematic, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, 40));

        btnAddThematic.setBackground(new java.awt.Color(255, 255, 255));
        btnAddThematic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddThematic.setForeground(new java.awt.Color(102, 102, 102));
        btnAddThematic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-add_user_male.png"))); // NOI18N
        btnAddThematic.setText("add");
        btnAddThematic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddThematicMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddThematicMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddThematicMouseEntered(evt);
            }
        });
        btnAddThematic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddThematicActionPerformed(evt);
            }
        });
        pnUpdate1.add(btnAddThematic, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 90, 40));

        btnUpdateThematic.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateThematic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdateThematic.setForeground(new java.awt.Color(102, 102, 102));
        btnUpdateThematic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-downloading_updates.png"))); // NOI18N
        btnUpdateThematic.setText("Update");
        btnUpdateThematic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpdateThematicMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateThematicMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateThematicMouseEntered(evt);
            }
        });
        btnUpdateThematic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateThematicActionPerformed(evt);
            }
        });
        pnUpdate1.add(btnUpdateThematic, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 110, 40));

        txtThematicDescribe.setColumns(20);
        txtThematicDescribe.setRows(5);
        jScrollPane5.setViewportView(txtThematicDescribe);

        pnUpdate1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 620, 60));

        lblThongbaoThematic.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblThongbaoThematic.setForeground(new java.awt.Color(255, 102, 102));
        lblThongbaoThematic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThongbaoThematicMouseExited(evt);
            }
        });
        pnUpdate1.add(lblThongbaoThematic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 620, 70));

        tbPanel1.addTab("Update", pnUpdate1);

        pnList1.setBackground(new java.awt.Color(255, 255, 255));
        pnList1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBorder(null);

        tblThematic.setAutoCreateRowSorter(true);
        tblThematic.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblThematic.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblThematic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null},
                {null, "", null, null, null, null}
            },
            new String [] {
                "THEMATIC.ID", "THEMATIC.NAME", "TUITION", "TIME ", "IMGAES", "DESCRIBE THE TOPIC"
            }
        ));
        tblThematic.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblThematic.setRowHeight(20);
        tblThematic.setSelectionBackground(new java.awt.Color(30, 144, 255));
        tblThematic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblThematicMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblThematicMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThematicMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblThematic);

        pnList1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 650, 390));

        btnDeleteThematic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-delete_trash_1.png"))); // NOI18N
        btnDeleteThematic.setText("Delete");
        btnDeleteThematic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDeleteThematicMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteThematicMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteThematicMouseEntered(evt);
            }
        });
        pnList1.add(btnDeleteThematic, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, 50));

        tbPanel1.addTab("List", pnList1);

        jPanel6.setBackground(new java.awt.Color(54, 32, 89));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(253, 244, 244));
        jLabel49.setText("Thematic Manager");
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel49MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel49)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel49)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelThematicLayout = new javax.swing.GroupLayout(panelThematic);
        panelThematic.setLayout(panelThematicLayout);
        panelThematicLayout.setHorizontalGroup(
            panelThematicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThematicLayout.createSequentialGroup()
                .addGroup(panelThematicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThematicLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelThematicLayout.setVerticalGroup(
            panelThematicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThematicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rSPanelsSlider2.add(panelThematic, "card2");

        panelCourse.setBackground(new java.awt.Color(255, 255, 255));
        panelCourse.setName("panelCourse"); // NOI18N

        tabs.setForeground(new java.awt.Color(102, 102, 102));
        tabs.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        tabs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabsMousePressed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabsMouseEntered(evt);
            }
        });

        pnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        pnUpdate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Thematic:");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        pnUpdate.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 32));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Opening Day:");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });
        pnUpdate.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, 32));
        pnUpdate.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 210, 10));

        txtCourseOpening.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCourseOpening.setBorder(null);
        pnUpdate.add(txtCourseOpening, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 210, 40));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Tuition:");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });
        pnUpdate.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 32));
        pnUpdate.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 170, 10));

        txtCourseTuition.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCourseTuition.setBorder(null);
        pnUpdate.add(txtCourseTuition, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 180, 40));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Note:");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel25MouseExited(evt);
            }
        });
        pnUpdate.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 32));
        pnUpdate.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 170, 10));

        txtCourseCreator.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCourseCreator.setBorder(null);
        pnUpdate.add(txtCourseCreator, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 170, 40));

        btnNewCourse.setBackground(new java.awt.Color(255, 255, 255));
        btnNewCourse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNewCourse.setForeground(new java.awt.Color(102, 102, 102));
        btnNewCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-update_left_rotation.png"))); // NOI18N
        btnNewCourse.setText("New");
        btnNewCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNewCourseMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewCourseMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewCourseMouseEntered(evt);
            }
        });
        btnNewCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCourseActionPerformed(evt);
            }
        });
        pnUpdate.add(btnNewCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, 40));

        btnAddCourse.setBackground(new java.awt.Color(255, 255, 255));
        btnAddCourse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddCourse.setForeground(new java.awt.Color(102, 102, 102));
        btnAddCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-add_user_male.png"))); // NOI18N
        btnAddCourse.setText("add");
        btnAddCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddCourseMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddCourseMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddCourseMouseEntered(evt);
            }
        });
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });
        pnUpdate.add(btnAddCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 90, 40));

        btnUpdateCourse.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateCourse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdateCourse.setForeground(new java.awt.Color(102, 102, 102));
        btnUpdateCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-downloading_updates.png"))); // NOI18N
        btnUpdateCourse.setText("Update");
        btnUpdateCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpdateCourseMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateCourseMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateCourseMouseEntered(evt);
            }
        });
        btnUpdateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCourseActionPerformed(evt);
            }
        });
        pnUpdate.add(btnUpdateCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 110, 40));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(102, 102, 102));
        jLabel60.setText("Time/hours:");
        jLabel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel60MouseExited(evt);
            }
        });
        pnUpdate.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, 32));
        pnUpdate.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 210, 10));

        txtCourseTime.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCourseTime.setBorder(null);
        pnUpdate.add(txtCourseTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 210, 40));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(102, 102, 102));
        jLabel61.setText("Date Created:");
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel61MouseExited(evt);
            }
        });
        pnUpdate.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, 32));
        pnUpdate.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 210, 10));

        txtCoursedateCreated.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCoursedateCreated.setBorder(null);
        pnUpdate.add(txtCoursedateCreated, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 210, 40));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(102, 102, 102));
        jLabel62.setText("Creator:");
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel62MouseExited(evt);
            }
        });
        pnUpdate.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 32));

        txtCourseNote.setColumns(20);
        txtCourseNote.setRows(5);
        jScrollPane7.setViewportView(txtCourseNote);

        pnUpdate.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 610, -1));

        cboChuyenDe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboChuyenDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Itsem 2", "Item 3", "Item 4" }));
        cboChuyenDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboChuyenDeMousePressed(evt);
            }
        });
        cboChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChuyenDeActionPerformed(evt);
            }
        });
        pnUpdate.add(cboChuyenDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 190, -1));

        btnStudentCourse.setBackground(new java.awt.Color(255, 255, 255));
        btnStudentCourse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnStudentCourse.setForeground(new java.awt.Color(102, 102, 102));
        btnStudentCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-listening_schoolboy_at_a_desk.png"))); // NOI18N
        btnStudentCourse.setText("Students");
        btnStudentCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnStudentCourseMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStudentCourseMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStudentCourseMouseEntered(evt);
            }
        });
        btnStudentCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentCourseActionPerformed(evt);
            }
        });
        pnUpdate.add(btnStudentCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, 40));

        lblThongbaoCourse.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblThongbaoCourse.setForeground(new java.awt.Color(255, 153, 102));
        lblThongbaoCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThongbaoCourseMouseExited(evt);
            }
        });
        pnUpdate.add(lblThongbaoCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 520, 50));

        tabs.addTab("Update", pnUpdate);

        pnList.setBackground(new java.awt.Color(255, 255, 255));
        pnList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        tblcourse.setAutoCreateRowSorter(true);
        tblcourse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblcourse.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblcourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null},
                {null, "", null, null, null, null, null}
            },
            new String [] {
                "COURSE.ID", "THEMATIC.ID", "TIME", "TUITION", "OPENINGDAY", "MADE BY", "DATE CREATED"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblcourse.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblcourse.setRowHeight(20);
        tblcourse.setSelectionBackground(new java.awt.Color(30, 144, 255));
        tblcourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcourseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcourse);

        pnList.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 650, 390));

        btnDeleteCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-delete_trash_1.png"))); // NOI18N
        btnDeleteCourse.setText("Delete");
        btnDeleteCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteCourseMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteCourseMouseEntered(evt);
            }
        });
        pnList.add(btnDeleteCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, 50));

        tabs.addTab("List", pnList);

        jPanel4.setBackground(new java.awt.Color(54, 32, 89));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(254, 250, 250));
        jLabel46.setText("Course Manager ");
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel46MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addGap(206, 206, 206))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelCourseLayout = new javax.swing.GroupLayout(panelCourse);
        panelCourse.setLayout(panelCourseLayout);
        panelCourseLayout.setHorizontalGroup(
            panelCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCourseLayout.createSequentialGroup()
                .addGroup(panelCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCourseLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelCourseLayout.setVerticalGroup(
            panelCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCourseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.getAccessibleContext().setAccessibleName("Update");

        rSPanelsSlider2.add(panelCourse, "card2");

        panelGeneralStatistics.setBackground(new java.awt.Color(255, 255, 255));
        panelGeneralStatistics.setName("panelGeneralStatistics"); // NOI18N
        panelGeneralStatistics.setPreferredSize(new java.awt.Dimension(668, 520));
        panelGeneralStatistics.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelsSlider1.setBackground(new java.awt.Color(255, 255, 255));

        panelGeneralStatistics2.setBackground(new java.awt.Color(255, 255, 255));
        panelGeneralStatistics2.setName("panelGeneralStatistics2"); // NOI18N
        panelGeneralStatistics2.setPreferredSize(new java.awt.Dimension(668, 520));
        panelGeneralStatistics2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(54, 32, 89));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(250, 245, 245));
        jLabel65.setText("General Statistics ");
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel65MouseExited(evt);
            }
        });
        jPanel15.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, 60));

        panelGeneralStatistics2.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 70));

        btnLearnerGeneral.setBackground(new java.awt.Color(0, 204, 51));
        btnLearnerGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLearnerGeneralMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLearnerGeneralMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLearnerGeneralMousePressed(evt);
            }
        });
        btnLearnerGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(250, 245, 245));
        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-writer_female.png"))); // NOI18N
        jLabel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel67MouseExited(evt);
            }
        });
        btnLearnerGeneral.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 70));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(250, 245, 245));
        jLabel69.setText("Learner");
        btnLearnerGeneral.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 180, 30));

        panelGeneralStatistics2.add(btnLearnerGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 260, 70));

        btnTranscript.setBackground(new java.awt.Color(0, 102, 102));
        btnTranscript.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTranscriptMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTranscriptMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTranscriptMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTranscriptMouseEntered(evt);
            }
        });
        btnTranscript.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(250, 245, 245));
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-test_partial_passed.png"))); // NOI18N
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel72MouseExited(evt);
            }
        });
        btnTranscript.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 50));

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(250, 245, 245));
        jLabel73.setText("Transcript");
        btnTranscript.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 140, 30));

        panelGeneralStatistics2.add(btnTranscript, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 260, 70));

        btnSynthetic.setBackground(new java.awt.Color(51, 51, 51));
        btnSynthetic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSyntheticMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSyntheticMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSyntheticMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSyntheticMouseEntered(evt);
            }
        });
        btnSynthetic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(250, 245, 245));
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-moleskine.png"))); // NOI18N
        jLabel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel64MouseExited(evt);
            }
        });
        btnSynthetic.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 50));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Synthetic Points ");
        btnSynthetic.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 210, 30));

        panelGeneralStatistics2.add(btnSynthetic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 260, 70));

        btnRevenue.setBackground(new java.awt.Color(0, 28, 97));
        btnRevenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRevenueMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRevenueMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRevenueMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRevenueMouseEntered(evt);
            }
        });
        btnRevenue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(250, 245, 245));
        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-banknotes.png"))); // NOI18N
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel70MouseExited(evt);
            }
        });
        btnRevenue.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 50));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(250, 245, 245));
        jLabel71.setText("Total Revenue ");
        btnRevenue.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 190, 30));

        panelGeneralStatistics2.add(btnRevenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 260, 70));

        rSPanelsSlider1.add(panelGeneralStatistics2, "card2");

        panelLearnerStatistics.setBackground(new java.awt.Color(255, 255, 255));
        panelLearnerStatistics.setName("panelGeneralStatistics"); // NOI18N
        panelLearnerStatistics.setPreferredSize(new java.awt.Dimension(668, 520));
        panelLearnerStatistics.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Learner Statistics Table", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane8.setBorder(null);

        tblLearnerStatisticstable.setAutoCreateRowSorter(true);
        tblLearnerStatisticstable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblLearnerStatisticstable.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblLearnerStatisticstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {"EP01", "Le Ngoc Hai", "123456", "male"},
                {"EP02", "Nguyen Cao Bang", "123456", "female"},
                {null, "", null, null}
            },
            new String [] {
                "YEAR", "LEARN PEOPLE ", "FIRSTLY", "LASTLY"
            }
        ));
        tblLearnerStatisticstable.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblLearnerStatisticstable.setRowHeight(20);
        tblLearnerStatisticstable.setSelectionBackground(new java.awt.Color(30, 144, 255));
        jScrollPane8.setViewportView(tblLearnerStatisticstable);
        if (tblLearnerStatisticstable.getColumnModel().getColumnCount() > 0) {
            tblLearnerStatisticstable.getColumnModel().getColumn(3).setHeaderValue("THE SHORTEST ");
        }

        jPanel14.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 610, 380));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 500));

        panelLearnerStatistics.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 660, 450));

        rSPanelsSlider1.add(panelLearnerStatistics, "card2");

        paneltableMarks.setBackground(new java.awt.Color(255, 255, 255));
        paneltableMarks.setName("panelGeneralStatistics"); // NOI18N
        paneltableMarks.setPreferredSize(new java.awt.Dimension(668, 520));
        paneltableMarks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Mark Table", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane10.setBorder(null);

        tblStudentMarkTable.setAutoCreateRowSorter(true);
        tblStudentMarkTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblStudentMarkTable.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblStudentMarkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {"EP01", "Le Ngoc Hai", "123456", "male"},
                {"EP02", "Nguyen Cao Bang", "123456", "female"},
                {null, "", null, null}
            },
            new String [] {
                "LEARNER.ID", "NAME", "MARK", "LEARNING"
            }
        ));
        tblStudentMarkTable.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblStudentMarkTable.setRowHeight(20);
        tblStudentMarkTable.setSelectionBackground(new java.awt.Color(30, 144, 255));
        jScrollPane10.setViewportView(tblStudentMarkTable);
        if (tblStudentMarkTable.getColumnModel().getColumnCount() > 0) {
            tblStudentMarkTable.getColumnModel().getColumn(3).setHeaderValue("THE SHORTEST ");
        }

        jPanel17.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 610, 380));

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 660, 490));

        paneltableMarks.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 660, 450));

        jLabel74.setBackground(new java.awt.Color(255, 255, 255));
        jLabel74.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(153, 153, 153));
        jLabel74.setText("Course:");
        jLabel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel74MouseExited(evt);
            }
        });
        paneltableMarks.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 90, 30));

        cboCourse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCourseActionPerformed(evt);
            }
        });
        paneltableMarks.add(cboCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 27, 150, 40));

        rSPanelsSlider1.add(paneltableMarks, "card2");

        panelSyntheticPoint.setBackground(new java.awt.Color(255, 255, 255));
        panelSyntheticPoint.setName("panelGeneralStatistics"); // NOI18N
        panelSyntheticPoint.setPreferredSize(new java.awt.Dimension(668, 520));
        panelSyntheticPoint.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Synthetic Marks Table", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane12.setBorder(null);

        tblSyntheticMarkTable.setAutoCreateRowSorter(true);
        tblSyntheticMarkTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblSyntheticMarkTable.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblSyntheticMarkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {null, "", null, null, null}
            },
            new String [] {
                "THEMATIC", "TOTAL STUDENTS ", "HIGHEST", "THE SHORTEST ", "AVERAGE"
            }
        ));
        tblSyntheticMarkTable.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblSyntheticMarkTable.setRowHeight(20);
        tblSyntheticMarkTable.setSelectionBackground(new java.awt.Color(30, 144, 255));
        jScrollPane12.setViewportView(tblSyntheticMarkTable);

        jPanel21.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 610, 380));

        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 660, 490));

        panelSyntheticPoint.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 660, 450));

        rSPanelsSlider1.add(panelSyntheticPoint, "card2");

        panelRevenueTable.setBackground(new java.awt.Color(255, 255, 255));
        panelRevenueTable.setName("panelGeneralStatistics"); // NOI18N
        panelRevenueTable.setPreferredSize(new java.awt.Dimension(668, 520));
        panelRevenueTable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Revenue Table", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane11.setBorder(null);

        tblRevenueTable.setAutoCreateRowSorter(true);
        tblRevenueTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblRevenueTable.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblRevenueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null},
                {null, "", null, null, null, null, null}
            },
            new String [] {
                "THEMATIC", "Number Of Courses ", "Number Of Students ", "REVENUE ", "THE HIGHEST PROGRAM ", "THE LOWEST MODULE ", "CENTRAL MODULE "
            }
        ));
        tblRevenueTable.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblRevenueTable.setRowHeight(20);
        tblRevenueTable.setSelectionBackground(new java.awt.Color(30, 144, 255));
        jScrollPane11.setViewportView(tblRevenueTable);

        jPanel19.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 610, 380));

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 660, 490));

        panelRevenueTable.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 660, 450));

        panelRevenueTable1.setBackground(new java.awt.Color(255, 255, 255));
        panelRevenueTable1.setName("panelGeneralStatistics"); // NOI18N
        panelRevenueTable1.setPreferredSize(new java.awt.Dimension(668, 520));
        panelRevenueTable1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Synthetic Marks Table", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane13.setBorder(null);

        tblStudentMarkTable3.setAutoCreateRowSorter(true);
        tblStudentMarkTable3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblStudentMarkTable3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblStudentMarkTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {null, "", null, null, null}
            },
            new String [] {
                "THEMATIC", "TOTAL STUDENTS ", "HIGHEST", "THE SHORTEST ", "AVERAGE"
            }
        ));
        tblStudentMarkTable3.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblStudentMarkTable3.setRowHeight(20);
        tblStudentMarkTable3.setSelectionBackground(new java.awt.Color(30, 144, 255));
        jScrollPane13.setViewportView(tblStudentMarkTable3);

        jPanel23.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 610, 380));

        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 660, 490));

        panelRevenueTable1.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 660, 450));

        panelRevenueTable2.setBackground(new java.awt.Color(255, 255, 255));
        panelRevenueTable2.setName("panelGeneralStatistics"); // NOI18N
        panelRevenueTable2.setPreferredSize(new java.awt.Dimension(668, 520));
        panelRevenueTable2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Synthetic Marks Table", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane14.setBorder(null);

        tblStudentMarkTable4.setAutoCreateRowSorter(true);
        tblStudentMarkTable4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblStudentMarkTable4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblStudentMarkTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {null, "", null, null, null}
            },
            new String [] {
                "THEMATIC", "TOTAL STUDENTS ", "HIGHEST", "THE SHORTEST ", "AVERAGE"
            }
        ));
        tblStudentMarkTable4.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblStudentMarkTable4.setRowHeight(20);
        tblStudentMarkTable4.setSelectionBackground(new java.awt.Color(30, 144, 255));
        jScrollPane14.setViewportView(tblStudentMarkTable4);

        jPanel25.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 610, 380));

        jPanel24.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 660, 490));

        panelRevenueTable2.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 660, 450));

        Year.setBackground(new java.awt.Color(255, 255, 255));
        Year.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        Year.setForeground(new java.awt.Color(153, 153, 153));
        Year.setText("Year:");
        Year.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                YearMouseExited(evt);
            }
        });
        panelRevenueTable2.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 90, 30));

        cboYear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelRevenueTable2.add(cboYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 170, 40));

        panelRevenueTable1.add(panelRevenueTable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelRevenueTable.add(panelRevenueTable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        rSPanelsSlider1.add(panelRevenueTable, "card2");

        panelGeneralStatistics.add(rSPanelsSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 520));

        rSPanelsSlider2.add(panelGeneralStatistics, "card2");

        bgPanel.add(rSPanelsSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 660, 510));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/Images/icons8-close_window_2.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        bgPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked

    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        setState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel15MousePressed

    private void btnEmployeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployeeMousePressed
//        active = "employee";
        resetcolor(btnEmployee);
        setcolor(btnHome);
        setcolor(btnlearner);
        setcolor(btnThematic);
        setcolor(btnCourse);

        setcolor(btnGenarlStatistics);

        if (panelEmployee.isShowing()) {
            PanelHelp.setVisible(false);
            panelGeneralStatistics2.setVisible(false);
            panelLearner.setVisible(false);
            panelThematic.setVisible(false);
            setcolor(btnSettings);
            panelCourse.setVisible(false);
            panelHome.setVisible(false);
        }


    }//GEN-LAST:event_btnEmployeeMousePressed

    private void btnlearnerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlearnerMousePressed
//        active = "learner";
        resetcolor(btnlearner);
        setcolor(btnHome);
        setcolor(btnEmployee);
        setcolor(btnThematic);
        setcolor(btnCourse);
        setcolor(btnSettings);
        setcolor(btnGenarlStatistics);

        rSPanelsSlider2.setPanelSlider(20, SOMEBITS, panelLearner, RSPanelsSlider.DIRECT.DOWN);
        if (panelLearner.isShowing()) {
            PanelHelp.setVisible(false);
            panelGeneralStatistics2.setVisible(false);
            panelEmployee.setVisible(false);
            panelThematic.setVisible(false);
            panelHome.setVisible(false);
            panelCourse.setVisible(false);

        }

    }//GEN-LAST:event_btnlearnerMousePressed

    private void btnThematicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThematicMousePressed
//        active = "thematic";
        resetcolor(btnThematic);
        setcolor(btnHome);
        setcolor(btnEmployee);
        setcolor(btnlearner);
        setcolor(btnCourse);
        setcolor(btnSettings);
        setcolor(btnGenarlStatistics);

        rSPanelsSlider2.setPanelSlider(20, SOMEBITS, panelThematic, RSPanelsSlider.DIRECT.UP);
        if (panelThematic.isShowing()) {
            PanelHelp.setVisible(false);
            panelGeneralStatistics2.setVisible(false);
            panelEmployee.setVisible(false);
            panelLearner.setVisible(false);
            panelHome.setVisible(false);

            panelCourse.setVisible(false);

        }
    }//GEN-LAST:event_btnThematicMousePressed

    private void btnCourseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCourseMousePressed
//        active = "course";
        resetcolor(btnCourse);
        setcolor(btnEmployee);
        setcolor(btnlearner);
        setcolor(btnThematic);
        setcolor(btnSettings);
        setcolor(btnGenarlStatistics);
        setcolor(btnHome);

        rSPanelsSlider2.setPanelSlider(20, SOMEBITS, panelCourse, RSPanelsSlider.DIRECT.LEFT);
        if (panelCourse.isShowing()) {
            PanelHelp.setVisible(false);
            panelGeneralStatistics2.setVisible(false);
            panelEmployee.setVisible(false);
            panelLearner.setVisible(false);
            panelHome.setVisible(false);
            panelThematic.setVisible(false);

        }
    }//GEN-LAST:event_btnCourseMousePressed

    private void btnGenarlStatisticsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenarlStatisticsMousePressed
//        active = "intro";
        resetcolor(btnGenarlStatistics);
        setcolor(btnHome);
        setcolor(btnEmployee);
        setcolor(btnlearner);
        setcolor(btnThematic);
        setcolor(btnCourse);
        setcolor(btnSettings);

        rSPanelsSlider2.setPanelSlider(20, SOMEBITS, panelGeneralStatistics, RSPanelsSlider.DIRECT.UP);
        if (panelGeneralStatistics2.isShowing()) {
            PanelHelp.setVisible(false);
            panelEmployee.setVisible(false);
            panelLearner.setVisible(false);
            panelCourse.setVisible(false);
            panelThematic.setVisible(false);
            panelHome.setVisible(false);

        }

    }//GEN-LAST:event_btnGenarlStatisticsMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel16MousePressed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void tabsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabsMouseEntered

    private void tabsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabsMousePressed
        tabs.setBackground(new Color(122, 72, 220));
    }//GEN-LAST:event_tabsMousePressed

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseExited

    private void jLabel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseExited

    private void btnNewCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewCourseActionPerformed

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed
//        if (checkBeforeSaveCourse() == true) {
//            txtCourseOpening.setBackground(new Color(255, 255, 255));
//            txtCourseTuition.setBackground(new Color(255, 255, 255));
//            txtCourseCreator.setBackground(new Color(255, 255, 255));
//            txtCourseTime.setBackground(new Color(255, 255, 255));
//            txtCoursedateCreated.setBackground(new Color(255, 255, 255));
//            txtCourseNote.setBackground(new Color(255, 255, 255));
//            lblThongbaoCourse.setText("");
//
//            this.insertCourse();
//        }
//

    }//GEN-LAST:event_btnAddCourseActionPerformed

    private void btnUpdateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCourseActionPerformed
//        this.updateCourse();
    }//GEN-LAST:event_btnUpdateCourseActionPerformed

    private void lblThongbaoCourseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongbaoCourseMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblThongbaoCourseMouseExited

    private void tbPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPanel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPanel2MousePressed

    private void tbPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPanel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPanel2MouseEntered

    private void jLabel54MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel54MouseExited

    private void btnHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMousePressed
//        active = "home";
        resetcolor(btnHome);
        setcolor(btnEmployee);
        setcolor(btnlearner);
        setcolor(btnThematic);
        setcolor(btnCourse);
        setcolor(btnSettings);
        setcolor(btnGenarlStatistics);
        
        rSPanelsSlider2.setPanelSlider(20, panelHome, RSPanelsSlider.DIRECT.RIGHT);
      


    }//GEN-LAST:event_btnHomeMousePressed

    private void jLabel36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel36MouseExited

    private void btnUpdateLearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateLearnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateLearnerActionPerformed

    private void btnAddLearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLearnerActionPerformed
//        if (checkBeforeSaveLearner() == true) {
//            txtLearnnerID.setBackground(new Color(255, 255, 255));
//            txtLearnerName.setBackground(new Color(255, 255, 255));
//            txtLearnerBirthDay.setBackground(new Color(255, 255, 255));
//            txtLearnerPhone.setBackground(new Color(255, 255, 255));
//            txtLearnerEmail.setBackground(new Color(255, 255, 255));
//            txtLearnerNote.setBackground(new Color(255, 255, 255));
//            lblThongbaoLearner.setText("");
//
//            this.insertLearner();
//        }
    }//GEN-LAST:event_btnAddLearnerActionPerformed

    private void btnNewLearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewLearnerActionPerformed

        txtLearnnerID.setBackground(new Color(255, 255, 255));
        txtLearnerName.setBackground(new Color(255, 255, 255));
        txtLearnerBirthDay.setBackground(new Color(255, 255, 255));
        txtLearnerPhone.setBackground(new Color(255, 255, 255));
        txtLearnerEmail.setBackground(new Color(255, 255, 255));
        txtLearnerNote.setBackground(new Color(255, 255, 255));
        lblThongbaoLearner.setText("");
//        this.clearLearner();
    }//GEN-LAST:event_btnNewLearnerActionPerformed

    private void jLabel40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel40MouseExited

    private void jLabel38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel38MouseExited

    private void jLabel37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel37MouseExited

    private void jLabel39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel39MouseExited

    private void jLabel41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel41MouseExited

    private void jLabel42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel42MouseExited

    private void jLabel34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel34MouseExited

    private void jLabel35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel35MouseExited

    private void jLabel43MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel43MouseExited

    private void jLabel44MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel44MouseExited

    private void jLabel45MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel45MouseExited

    private void btnNewThematicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewThematicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewThematicActionPerformed

    private void btnAddThematicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddThematicActionPerformed
//        if (checkBeforeSaveThematics() == true) {
//            txtThematicID.setBackground(new Color(255, 255, 255));
//            txtThematicName.setBackground(new Color(255, 255, 255));
//            txtThematicTuition.setBackground(new Color(255, 255, 255));
//            txtThematicTime.setBackground(new Color(255, 255, 255));
//            txtThematicDescribe.setBackground(new Color(255, 255, 255));
//            lblThongbaoThematic.setText("");
//            this.insertThematic();
//        }
    }//GEN-LAST:event_btnAddThematicActionPerformed

    private void btnUpdateThematicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateThematicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateThematicActionPerformed

    private void tbPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPanel1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPanel1MousePressed

    private void tbPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPanel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPanel1MouseEntered

    private void jLabel49MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel49MouseExited

    private void btnAddThematicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddThematicMouseExited
        btnAddThematic.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnAddThematicMouseExited

    private void btnAddThematicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddThematicMouseEntered

        btnAddThematic.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_btnAddThematicMouseEntered

    private void btnUpdateThematicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateThematicMouseExited
        btnUpdateThematic.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnUpdateThematicMouseExited

    private void btnUpdateThematicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateThematicMouseEntered
        btnUpdateThematic.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_btnUpdateThematicMouseEntered

    private void btnNewThematicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewThematicMouseExited
        // TODO add your handling code here:
        btnNewThematic.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnNewThematicMouseExited

    private void btnNewThematicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewThematicMouseEntered
        btnNewThematic.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_btnNewThematicMouseEntered

    private void btnDeleteThematicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteThematicMouseExited
        btnDeleteThematic.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnDeleteThematicMouseExited

    private void btnDeleteThematicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteThematicMouseEntered
        btnDeleteThematic.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_btnDeleteThematicMouseEntered

    private void btnAddLearnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddLearnerMouseEntered
        btnAddLearner.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_btnAddLearnerMouseEntered

    private void btnAddLearnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddLearnerMouseExited
        btnAddLearner.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnAddLearnerMouseExited

    private void btnNewLearnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewLearnerMouseEntered
        btnNewLearner.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_btnNewLearnerMouseEntered

    private void btnNewLearnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewLearnerMouseExited
        btnNewLearner.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnNewLearnerMouseExited

    private void btnUpdateLearnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateLearnerMouseEntered
        btnUpdateLearner.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_btnUpdateLearnerMouseEntered

    private void btnUpdateLearnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateLearnerMouseExited
        btnUpdateLearner.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnUpdateLearnerMouseExited

    private void btnDeleteLearnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteLearnerMouseEntered
        btnDeleteLearner.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_btnDeleteLearnerMouseEntered

    private void btnDeleteLearnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteLearnerMouseExited
        btnDeleteLearner.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnDeleteLearnerMouseExited

    private void btnDeleteCourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteCourseMouseEntered
        btnDeleteCourse.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_btnDeleteCourseMouseEntered

    private void btnDeleteCourseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteCourseMouseExited
        btnDeleteCourse.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnDeleteCourseMouseExited

    private void btnAddCourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCourseMouseEntered
        btnAddCourse.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_btnAddCourseMouseEntered

    private void btnAddCourseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCourseMouseExited
        btnAddCourse.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnAddCourseMouseExited

    private void btnNewCourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewCourseMouseEntered
        btnNewCourse.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_btnNewCourseMouseEntered

    private void btnNewCourseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewCourseMouseExited
        btnNewCourse.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnNewCourseMouseExited

    private void btnUpdateCourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateCourseMouseEntered
        btnUpdateCourse.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_btnUpdateCourseMouseEntered

    private void btnUpdateCourseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateCourseMouseExited
        btnUpdateCourse.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnUpdateCourseMouseExited

    private void jLabel47MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel47MouseExited

    private void jLabel50MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel50MouseExited

    private void jLabel51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel51MouseExited

    private void jLabel53MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel53MouseExited

    private void jLabel55MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel55MouseExited

    private void jLabel56MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel56MouseExited

    private void jLabel57MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel57MouseExited

    private void btnNewAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewAdminMouseExited
        btnNewAdmin.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnNewAdminMouseExited

    private void btnNewAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewAdminMouseEntered
        btnNewAdmin.setBackground(new Color(76, 182, 237));
    }//GEN-LAST:event_btnNewAdminMouseEntered

    private void btnNewAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewAdminActionPerformed

    private void btnAddAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAdminMouseExited
        btnAddAdmin.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnAddAdminMouseExited

    private void btnAddAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAdminMouseEntered
        btnAddAdmin.setBackground(new Color(76, 182, 237));
    }//GEN-LAST:event_btnAddAdminMouseEntered

    private void btnAddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddAdminActionPerformed

    private void btnUpdateAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateAdminMouseExited
        btnUpdateAdmin.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnUpdateAdminMouseExited

    private void btnUpdateAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateAdminMouseEntered
        btnUpdateAdmin.setBackground(new Color(76, 182, 237));

    }//GEN-LAST:event_btnUpdateAdminMouseEntered

    private void btnUpdateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateAdminActionPerformed

    private void btnDeleteAdmin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteAdmin1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteAdmin1MouseExited

    private void btnDeleteAdmin1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteAdmin1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteAdmin1MouseEntered

    private void tbPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPanel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPanel3MousePressed

    private void tbPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPanel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPanel3MouseEntered

    private void jLabel60MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel60MouseExited

    private void jLabel61MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel61MouseExited

    private void jLabel62MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel62MouseExited

    private void jLabel65MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel65MouseExited

    private void btnRevenueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevenueMouseEntered
        btnRevenue.setBackground(new Color(153, 153, 255));

    }//GEN-LAST:event_btnRevenueMouseEntered

    private void btnRevenueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevenueMouseExited
        btnRevenue.setBackground(new Color(0, 28, 97));
    }//GEN-LAST:event_btnRevenueMouseExited

    private void jLabel70MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel70MouseExited

    private void btnSyntheticMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSyntheticMouseEntered
        btnSynthetic.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_btnSyntheticMouseEntered

    private void btnSyntheticMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSyntheticMouseExited
        btnSynthetic.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_btnSyntheticMouseExited

    private void btnSyntheticMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSyntheticMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSyntheticMouseClicked

    private void jLabel64MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel64MouseExited

    private void btnTranscriptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTranscriptMouseEntered
        btnTranscript.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_btnTranscriptMouseEntered

    private void btnTranscriptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTranscriptMouseExited
        btnTranscript.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_btnTranscriptMouseExited

    private void jLabel72MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel72MouseExited

    private void btnLearnerGeneralMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLearnerGeneralMouseEntered
        btnLearnerGeneral.setBackground(new Color(153, 153, 255));

    }//GEN-LAST:event_btnLearnerGeneralMouseEntered

    private void btnLearnerGeneralMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLearnerGeneralMouseExited
        btnLearnerGeneral.setBackground(new Color(0, 204, 51));
    }//GEN-LAST:event_btnLearnerGeneralMouseExited

    private void jLabel67MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel67MouseExited

    private void btnLearnerGeneralMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLearnerGeneralMousePressed
        rSPanelsSlider1.setPanelSlider(20, panelLearnerStatistics, RSPanelsSlider.DIRECT.LEFT);
//        fillTableNguoiHoc();

    }//GEN-LAST:event_btnLearnerGeneralMousePressed

    private void btnBack1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack1MousePressed
        rSPanelsSlider1.setPanelSlider(20, panelGeneralStatistics2, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnBack1MousePressed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnBack2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack2MousePressed
        rSPanelsSlider1.setPanelSlider(20, panelGeneralStatistics2, RSPanelsSlider.DIRECT.RIGHT);

    }//GEN-LAST:event_btnBack2MousePressed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void jLabel74MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel74MouseExited

    private void btnTranscriptMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTranscriptMousePressed
        rSPanelsSlider1.setPanelSlider(20, paneltableMarks, RSPanelsSlider.DIRECT.LEFT);

    }//GEN-LAST:event_btnTranscriptMousePressed

    private void btnBack3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack3MousePressed
        rSPanelsSlider1.setPanelSlider(20, panelGeneralStatistics2, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnBack3MousePressed

    private void btnBack3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack3MouseReleased

    private void btnSyntheticMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSyntheticMousePressed

        rSPanelsSlider1.setPanelSlider(20, panelSyntheticPoint, RSPanelsSlider.DIRECT.LEFT);
//        fillTableKhoaHoc();
    }//GEN-LAST:event_btnSyntheticMousePressed

    private void btnBack4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack4MousePressed
        rSPanelsSlider1.setPanelSlider(20, panelGeneralStatistics2, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnBack4MousePressed

    private void btnBack4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack4MouseReleased

    private void btnBack4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack4ActionPerformed

    private void btnRevenueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevenueMousePressed
        rSPanelsSlider1.setPanelSlider(20, panelRevenueTable, RSPanelsSlider.DIRECT.LEFT);

//        fillTableDoanhThu();
    }//GEN-LAST:event_btnRevenueMousePressed

    private void btnBack5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack5MousePressed

    private void btnBack5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack5MouseReleased

    private void btnBack5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack5ActionPerformed

    private void btnBack6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack6MousePressed

    private void btnBack6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack6MouseReleased

    private void btnBack6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack6ActionPerformed

    private void YearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YearMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_YearMouseExited

    private void btnAddAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAdminMousePressed
//        if (checkBeforeSave() == true) {
//            txtEmployID.setBackground(new Color(255, 255, 255));
//            txtPassword.setBackground(new Color(255, 255, 255));
//            txtReEnterPassword.setBackground(new Color(255, 255, 255));
//            txtNameEmployee.setBackground(new Color(255, 255, 255));
//            lblImages.setBackground(new Color(255, 255, 255));
//            insert();
//        }


    }//GEN-LAST:event_btnAddAdminMousePressed

    private void btnUpdateAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateAdminMousePressed
//        this.update();
    }//GEN-LAST:event_btnUpdateAdminMousePressed

    private void btnDeleteAdmin1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteAdmin1MousePressed
//        if (checkDelete() == true) {
//            this.delete();
//        }


    }//GEN-LAST:event_btnDeleteAdmin1MousePressed

    private void btnNewAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewAdminMousePressed

        txtEmployID.setBackground(new Color(255, 255, 255));
        txtPassword.setBackground(new Color(255, 255, 255));
        txtReEnterPassword.setBackground(new Color(255, 255, 255));
        txtNameEmployee.setBackground(new Color(255, 255, 255));
        lblImages.setBackground(new Color(255, 255, 255));
//        this.clear();

    }//GEN-LAST:event_btnNewAdminMousePressed

    private void tblAdminManagerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdminManagerMousePressed

    }//GEN-LAST:event_tblAdminManagerMousePressed

    private void tblAdminManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdminManagerMouseClicked
//        NhanVien model1 = new NhanVien();
//        btnUpdateAdmin.setEnabled(true);
//        btnDeleteAdmin1.setEnabled(true);
//
//        int i = tblAdminManager.getSelectedRow();
//        TableModel model = tblAdminManager.getModel();
//        txtEmployID.setText(model.getValueAt(i, 0).toString());
//        txtPassword.setText(model.getValueAt(i, 1).toString());
//        txtNameEmployee.setText(model.getValueAt(i, 2).toString());
//        String sex = model.getValueAt(i, 3).toString();
//        if (sex.equals("Male")) {
//            rdMale.setSelected(true);
//        } else if (sex.equals("Female")) {
//            rdFemale.setSelected(true);
//        }
//        String position1 = model.getValueAt(i, 4).toString();
//        if (position1.equals("Manager")) {
//            cboPositon.select("Manager");
//        } else {
//            cboPositon.select("Employees");
//        }
//        lblImages.setToolTipText((String) model.getValueAt(i, 5));
//        if ((String) model.getValueAt(i, 5) != null) {
//            lblImages.setIcon(ShareHelper.readLogo((String) model.getValueAt(i, 5)));
//        }

    }//GEN-LAST:event_tblAdminManagerMouseClicked

    private void lblImagesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImagesMouseExited

    private void lblThongbaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongbaoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblThongbaoMouseExited

    private void lblImagesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagesMousePressed
//        selectImage();
    }//GEN-LAST:event_lblImagesMousePressed

    private void lblLearnerImagesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLearnerImagesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLearnerImagesMouseExited

    private void btnAddLearnerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddLearnerMousePressed


    }//GEN-LAST:event_btnAddLearnerMousePressed

    private void lblLearnerImagesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLearnerImagesMousePressed
//        this.selectImageLearner();
    }//GEN-LAST:event_lblLearnerImagesMousePressed

    private void tblLearnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLearnerMouseClicked
//        NguoiHoc model1 = new NguoiHoc();
//
//        btnUpdateLearner.setEnabled(true);
//        btnDeleteLearner.setEnabled(true);
//        int i = tblLearner.getSelectedRow();
//        TableModel model = tblLearner.getModel();
//        txtLearnnerID.setText(model.getValueAt(i, 0).toString());
//        txtLearnerName.setText(model.getValueAt(i, 1).toString());
//        String sex = model.getValueAt(i, 2).toString();
//        if (sex.equals("Male")) {
//            rdLearnerMale.setSelected(true);
//        } else if (sex.equals("Female")) {
//            rdLearnerFemale.setSelected(true);
//        }
//        txtLearnerBirthDay.setText(model.getValueAt(i, 3).toString());
//        txtLearnerPhone.setText(model.getValueAt(i, 4).toString());
//        txtLearnerEmail.setText(model.getValueAt(i, 5).toString());
//        txtLearnerNote.setText(model.getValueAt(i, 6).toString());
//        lblLearnerImages.setToolTipText((String) model.getValueAt(i, 7));
//        if ((String) model.getValueAt(i, 7) != null) {
//            lblLearnerImages.setIcon(ShareHelper.readLogo((String) model.getValueAt(i, 7)));
//        }
    }//GEN-LAST:event_tblLearnerMouseClicked

    private void btnUpdateLearnerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateLearnerMousePressed
//        try {
//            this.updateLearner();
//        } catch (ParseException ex) {
//            DialogHelper.alert(panelLearner, ex.getMessage());
//        }
    }//GEN-LAST:event_btnUpdateLearnerMousePressed

    private void txtFindIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFindIDActionPerformed

    private void btnFindLearnerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindLearnerMousePressed
//        this.loadLearner();
//        this.clearLearner();
    }//GEN-LAST:event_btnFindLearnerMousePressed

    private void btnNewLearnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewLearnerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewLearnerMouseClicked

    private void btnDeleteLearnerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteLearnerMousePressed
//        this.deleteLearner();
    }//GEN-LAST:event_btnDeleteLearnerMousePressed

    private void btnDeleteLearnerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteLearnerMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteLearnerMouseReleased

    private void lblThematicImagesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThematicImagesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblThematicImagesMouseExited

    private void txtThematicIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThematicIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThematicIDActionPerformed

    private void btnAddThematicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddThematicMousePressed

    }//GEN-LAST:event_btnAddThematicMousePressed

    private void btnUpdateThematicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateThematicMousePressed
//        this.updateThematic();
    }//GEN-LAST:event_btnUpdateThematicMousePressed

    private void btnNewThematicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewThematicMousePressed
//        this.clearThematic();
    }//GEN-LAST:event_btnNewThematicMousePressed

    private void btnDeleteThematicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteThematicMousePressed
//        deleteThematic();
    }//GEN-LAST:event_btnDeleteThematicMousePressed

    private void tblThematicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThematicMouseClicked
//        btnUpdateThematic.setEnabled(true);
//        btnDeleteThematic.setEnabled(true);
//        int i = tblThematic.getSelectedRow();
//        TableModel model = tblThematic.getModel();
//        txtThematicID.setText(model.getValueAt(i, 0).toString());
//        txtThematicName.setText(model.getValueAt(i, 1).toString());
//        txtThematicTuition.setText(model.getValueAt(i, 2).toString());
//        txtThematicTime.setText(model.getValueAt(i, 3).toString());
//        lblThematicImages.setToolTipText((String) model.getValueAt(i, 4));
//        if ((String) model.getValueAt(i, 4) != null) {
//            lblThematicImages.setIcon(ShareHelper.readLogo((String) model.getValueAt(i, 4)));
//        }
//        txtThematicDescribe.setText(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_tblThematicMouseClicked

    private void tblThematicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThematicMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblThematicMousePressed

    private void lblThematicImagesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThematicImagesMousePressed
//        this.selectImageThematic();
    }//GEN-LAST:event_lblThematicImagesMousePressed

    private void tblThematicMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThematicMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblThematicMouseReleased

    private void btnStudentCourseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentCourseMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentCourseMouseExited

    private void btnStudentCourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentCourseMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentCourseMouseEntered

    private void btnStudentCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentCourseActionPerformed
//        this.openHocVien();
    }//GEN-LAST:event_btnStudentCourseActionPerformed

    private void btnAddCourseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCourseMousePressed

    }//GEN-LAST:event_btnAddCourseMousePressed

    private void btnUpdateCourseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateCourseMousePressed

    }//GEN-LAST:event_btnUpdateCourseMousePressed

    private void btnNewCourseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewCourseMousePressed
//        this.clearCourse();
    }//GEN-LAST:event_btnNewCourseMousePressed

    private void cboChuyenDeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboChuyenDeMousePressed
//        selectComboBox();
    }//GEN-LAST:event_cboChuyenDeMousePressed

    private void tblcourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcourseMouseClicked
//        if (evt.getClickCount() == 2) {
//            this.index = tblcourse.rowAtPoint(evt.getPoint());
//            if (this.index >= 0) {
//                this.editCourse();
//                tabs.setSelectedIndex(0);
//                btnStudentCourse.setEnabled(true);
//                btnUpdateCourse.setEnabled(true);
//                btnDeleteCourse.setEnabled(true);
//            }
//        }

//        int i = tblcourse.getSelectedRow();
//        TableModel model = tblcourse.getModel();
//        txtCourseCreator.setText(model.getValueAt(i, 1).toString());
//        txtCourseTime.setText(model.getValueAt(i, 2).toString());
//        txtCourseTuition.setText(model.getValueAt(i, 3).toString());
//        txtCourseOpening.setText(model.getValueAt(i, 4).toString());
//        txtCourseCreator.setText(model.getValueAt(i, 5).toString());
//        txtCoursedateCreated.setText(model.getValueAt(i, 6).toString());
//        this.editCourse();

    }//GEN-LAST:event_tblcourseMouseClicked

    private void btnStudentCourseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentCourseMousePressed

    }//GEN-LAST:event_btnStudentCourseMousePressed

    private void cboCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCourseActionPerformed
//        fillTableBangDiem();
    }//GEN-LAST:event_cboCourseActionPerformed

    private void btnTranscriptMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTranscriptMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTranscriptMouseReleased

    private void btnRevenueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevenueMouseClicked
//        fillTableDoanhThu();
    }//GEN-LAST:event_btnRevenueMouseClicked

    private void btnSettingsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingsMousePressed
//        active = "Setting";
        resetcolor(btnSettings);
        setcolor(btnHome);
        setcolor(btnEmployee);
        setcolor(btnlearner);
        setcolor(btnThematic);
        setcolor(btnCourse);
        setcolor(btnGenarlStatistics);

        rSPanelsSlider2.setPanelSlider(20, PanelHelp, RSPanelsSlider.DIRECT.RIGHT);
        if (PanelHelp.isShowing()) {
            panelGeneralStatistics.setVisible(false);
            panelHome.setVisible(false);
            panelEmployee.setVisible(false);
            panelLearner.setVisible(false);
            panelCourse.setVisible(false);
            panelThematic.setVisible(false);

        }

    }//GEN-LAST:event_btnSettingsMousePressed

    private void lblUSerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUSerMouseReleased

        jPopupMenu1.show(this, 40, 500);
    }//GEN-LAST:event_lblUSerMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//        ShareHelper.logoff();
//        new LoginJDialog().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void lblUSerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUSerMouseExited
        lblUSer.setBackground(new Color(54, 32, 89));
    }//GEN-LAST:event_lblUSerMouseExited

    private void lblUSerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUSerMouseEntered
        lblUSer.setBackground(new Color(85, 65, 118));
    }//GEN-LAST:event_lblUSerMouseEntered

    private void btnNewLearnerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewLearnerMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewLearnerMousePressed

    private void jLabel85MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel85MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel85MouseExited

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void lblThongbaoLearnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongbaoLearnerMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblThongbaoLearnerMouseExited

    private void btnPrintMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMousePressed

    }//GEN-LAST:event_btnPrintMousePressed

    private void lblThongbaoThematicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongbaoThematicMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblThongbaoThematicMouseExited

    private void jLabel46MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel46MouseExited

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
//        this.SelectPathToPrint();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
//        this.SelectPathToPrintPDF();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnPrintMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseReleased
        jPopupMenu2.show(panelLearner, 40, 65);

    }//GEN-LAST:event_btnPrintMouseReleased

    private void btnFindLearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindLearnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFindLearnerActionPerformed

    private void cboChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChuyenDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboChuyenDeActionPerformed

    private void jPopupMenu2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPopupMenu2MouseReleased
    void setcolor(JPanel panel) {
        panel.setBackground(new Color(85, 65, 118));

    }

    void resetcolor(JPanel panel) {
        panel.setBackground(new Color(122, 72, 220));

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelHelp;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel Year;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnAddAdmin;
    private javax.swing.JButton btnAddCourse;
    private javax.swing.JButton btnAddLearner;
    private javax.swing.JButton btnAddThematic;
    private javax.swing.JPanel btnCourse;
    private javax.swing.JButton btnDeleteAdmin1;
    private javax.swing.JButton btnDeleteCourse;
    private javax.swing.JButton btnDeleteLearner;
    private javax.swing.JButton btnDeleteThematic;
    private javax.swing.JPanel btnEmployee;
    private javax.swing.JButton btnFindLearner;
    private javax.swing.JPanel btnGenarlStatistics;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnLearnerGeneral;
    private javax.swing.JButton btnNewAdmin;
    private javax.swing.JButton btnNewCourse;
    private javax.swing.JButton btnNewLearner;
    private javax.swing.JButton btnNewThematic;
    private javax.swing.JButton btnPrint;
    private javax.swing.JPanel btnRevenue;
    private javax.swing.JPanel btnSettings;
    private javax.swing.JButton btnStudentCourse;
    private javax.swing.JPanel btnSynthetic;
    private javax.swing.JPanel btnThematic;
    private javax.swing.JPanel btnTranscript;
    private javax.swing.JButton btnUpdateAdmin;
    private javax.swing.JButton btnUpdateCourse;
    private javax.swing.JButton btnUpdateLearner;
    private javax.swing.JButton btnUpdateThematic;
    private javax.swing.JPanel btnlearner;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboChuyenDe;
    private javax.swing.JComboBox<String> cboCourse;
    private java.awt.Choice cboPositon;
    private javax.swing.JComboBox<String> cboYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JPopupMenu.Separator jSeparator28;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblHello;
    private javax.swing.JLabel lblImages;
    private javax.swing.JLabel lblLearnerImages;
    private javax.swing.JLabel lblThematicImages;
    private javax.swing.JLabel lblThongbao;
    private javax.swing.JLabel lblThongbaoCourse;
    private javax.swing.JLabel lblThongbaoLearner;
    private javax.swing.JLabel lblThongbaoThematic;
    private javax.swing.JLabel lblUSer;
    private javax.swing.JPanel panelCourse;
    private javax.swing.JPanel panelEmployee;
    private javax.swing.JPanel panelGeneralStatistics;
    private javax.swing.JPanel panelGeneralStatistics2;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelLearner;
    private javax.swing.JPanel panelLearnerStatistics;
    private javax.swing.JPanel panelRevenueTable;
    private javax.swing.JPanel panelRevenueTable1;
    private javax.swing.JPanel panelRevenueTable2;
    private javax.swing.JPanel panelSyntheticPoint;
    private javax.swing.JPanel panelThematic;
    private javax.swing.JPanel paneltableMarks;
    private javax.swing.JPanel pnList;
    private javax.swing.JPanel pnList1;
    private javax.swing.JPanel pnList2;
    private javax.swing.JPanel pnList3;
    private javax.swing.JPanel pnUpdate;
    private javax.swing.JPanel pnUpdate1;
    private javax.swing.JPanel pnUpdate2;
    private javax.swing.JPanel pnUpdate3;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private rojerusan.RSPanelsSlider rSPanelsSlider2;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdLearnerFemale;
    private javax.swing.JRadioButton rdLearnerMale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTabbedPane tbPanel1;
    private javax.swing.JTabbedPane tbPanel2;
    private javax.swing.JTabbedPane tbPanel3;
    private javax.swing.JTable tblAdminManager;
    private javax.swing.JTable tblLearner;
    private javax.swing.JTable tblLearnerStatisticstable;
    private javax.swing.JTable tblRevenueTable;
    private javax.swing.JTable tblStudentMarkTable;
    private javax.swing.JTable tblStudentMarkTable3;
    private javax.swing.JTable tblStudentMarkTable4;
    private javax.swing.JTable tblSyntheticMarkTable;
    private javax.swing.JTable tblThematic;
    private javax.swing.JTable tblcourse;
    private javax.swing.JTextField txtCourseCreator;
    private javax.swing.JTextArea txtCourseNote;
    private javax.swing.JTextField txtCourseOpening;
    private javax.swing.JTextField txtCourseTime;
    private javax.swing.JTextField txtCourseTuition;
    private javax.swing.JTextField txtCoursedateCreated;
    private javax.swing.JTextField txtEmployID;
    private javax.swing.JTextField txtFindID;
    private javax.swing.JTextField txtLearnerBirthDay;
    private javax.swing.JTextField txtLearnerEmail;
    private javax.swing.JTextField txtLearnerName;
    private javax.swing.JTextArea txtLearnerNote;
    private javax.swing.JTextField txtLearnerPhone;
    private javax.swing.JTextField txtLearnnerID;
    private javax.swing.JTextField txtNameEmployee;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtReEnterPassword;
    private javax.swing.JTextArea txtThematicDescribe;
    private javax.swing.JTextField txtThematicID;
    private javax.swing.JTextField txtThematicName;
    private javax.swing.JTextField txtThematicTime;
    private javax.swing.JTextField txtThematicTuition;
    // End of variables declaration//GEN-END:variables
}

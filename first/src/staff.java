class StaffMember{
    String Name;
    int StaffId;
    StaffMember(String Name,int StaffId){
        this.Name=Name;
        this.StaffId=StaffId;
    }

    public int getStaffId() {
        return StaffId;
    }

    public String getName() {
        return Name;
    }
}

class Professor extends StaffMember{
     String Subject;
    Professor(String Subject,String Name, int StaffId) {
        super(Name, StaffId);
        this.Subject=Subject;
    }

    public String getSubject() {
        return Subject;
    }
}

class AdminStaff extends StaffMember{
    String Department;
    AdminStaff(String Department,String Name, int StaffId) {
        super(Name, StaffId);
        this.Department=Department;
    }

    public String getDepartment() {
        return Department;
    }
}

class SupportStaff extends StaffMember{
    int LabNumber;
    SupportStaff(int LabNumber,String Name, int StaffId) {
        super(Name, StaffId);
        this.LabNumber=LabNumber;
    }

    public int getLabNumber() {
        return LabNumber;
    }
}

public class staff {
    public static void main(String[] args) {

        Professor p1=new Professor("COA","Dr. S. R. Chickerur",1);
        AdminStaff a1=new AdminStaff("Fee handling","ABC",121);
        SupportStaff s1=new SupportStaff(7,"xxx",23);
        System.out.printf("Professor details\nStaff Id: %d\nName : %s\nSubject : %s\n---------------\n",p1.getStaffId(),p1.getName(),p1.getSubject());
        System.out.printf("Administrative Staff details\nStaff Id: %d\nName : %s\nDepartment : %s\n---------------\n",a1.getStaffId(),a1.getName(),a1.getDepartment());
        System.out.printf("Support Staff details\nStaff Id: %d\nName : %s\nLab No : %d\n---------------\n",s1.getStaffId(),s1.getName(),s1.getLabNumber());
    }
}

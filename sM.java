import java.util.Scanner;
class sM{
public static void main(String[] args){
System.out.println("Hi User ");
logInPage lip=new logInPage();
lip.page1();
}
}
class logInPage{
int pg1,opt;
String aID="titir12r",aPass="1234@Admin";
String studentId,adminId,adminPassword,password;
Scanner s=new Scanner(System.in);
Scanner s1=new Scanner(System.in);
studentDetails s0=new studentDetails();
void page1(){
System.out.println("\t\t\t Welcome to Student Management System Portal \t\t\t");
System.out.println("1) Log in as a Student.");
System.out.println("2) Log in as a Page Admin");
System.out.println("3) Don't have an account?Sign up as a now");
System.out.println("Enter your chooice : ");
pg1=s.nextInt();
karo();
}
void verifyCentre(){
int Lo;
System.out.println("Enter Admin ID : ");
adminId=s1.next();
if(adminId.equals(aID)){
System.out.println("Enter Admin Password : ");
adminPassword=s1.next();
if(aPass.equals(adminPassword)){
System.out.println("\t\t\tHey admin,Welcome to Admin Acess Page\t\t\t");
System.out.println(" ");
s0.adminControl();
System.out.println("Enter your chooice : \n");
System.out.println("1) Search a student details");
System.out.println("2) View all");
System.out.println("3) Enter student details");
opt=s.nextInt();
if(opt==1){
s0.search();
}
if(opt==2){
s0.display();
}
}else
System.out.println("Wrong Password Can't Log In To Portal");
}else
System.out.println("Wrong Admin ID Can't Log In To Portal");
if(opt==3){
s0.enterDetails();
}
System.out.println("Press 0 to log out");
Lo=s.nextInt();
if(Lo==0)
page1();
}
void homePage(String k,int o){
int lo;
System.out.println("Hi "+k);
System.out.println("\n Here are your details : ");
System.out.println("  ");
System.out.println("Name : "+s0.name[o]+" "+s0.surname[o]);
System.out.println("College ID : "+s0.collegeID[o]);
System.out.println("Email : "+s0.email[o]);
System.out.println("Phone Number : "+s0.phoneNumber[o]);
System.out.println("D.O.B : "+s0.dob[o]);
System.out.println("Sex : "+s0.sex[o]);
System.out.println("Father's Name : "+s0.fatherName[o]);
System.out.println("Mother's Name : "+s0.motherName[o]);
System.out.println("Address : "+s0.address[o]);
System.out.println("Blood Group : "+s0.bloodGroup[o]);
System.out.println("University Roll Number : "+s0.universityRollNumber[o]);
System.out.println("\n\n Press 0 to log out");
lo=s.nextInt();
if(lo==0){
System.out.println("\n\t\t\tLogged Out From Portal\t\t\t\n");
page1();
}
} 
void vrfyStu(){
int c=0;
for(int i=0;i<s0.totalStdents;i++){
if(studentId.equals(s0.sID[i])){
System.out.println("Enter Password : ");
password=s1.next();
if(password.equals(s0.sPass[i])){
System.out.println("Log in successfully done redirecting you to home page ...");
c=1;
homePage(s0.name[i],i);
}
}
}
if(c==0)
System.out.println("Invalid Log in credentials !!!");
}
void karo(){
if(pg1==1){
System.out.println("Enter student ID : ");
studentId=s1.next();
vrfyStu();
}else if(pg1==2){
verifyCentre();
}else if(pg1==3){
s0.assignment();
page1();
}else{
System.out.println("Invalid Input !!!");
}
}
}
class studentDetails{
String[] name,surname,email,dob,phoneNumber,address,universityRollNumber,motherName,fatherName,sex,collegeID,bloodGroup,sID,sPass;
int totalStdents;
int i=0;
String aa,pp;
Scanner sd=new Scanner(System.in);
Scanner s1=new Scanner(System.in);
void adminControl(){
System.out.println("Enter how many students : ");
totalStdents=sd.nextInt();
name=new String[totalStdents];
surname=new String[totalStdents];
collegeID=new String[totalStdents];
email=new String[totalStdents];
phoneNumber=new String[totalStdents];
dob=new String[totalStdents];
sex=new String[totalStdents];
fatherName=new String[totalStdents];
motherName=new String[totalStdents];
address=new String[totalStdents];
bloodGroup=new String[totalStdents];
universityRollNumber=new String[totalStdents];
sID=new String[totalStdents];
sPass=new String[totalStdents];
}
void assignment(){
System.out.println("Create student Id : ");
sID[i]=s1.next();
System.out.println("create password : ");
sPass[i]=s1.next();
i++;
}
void enterDetails(){
int i=0;
while(i<totalStdents){
System.out.print("Enter your Student's Name : ");
name[i]=sd.next();
System.out.print("Enter your Student's Name : ");
name[i]=sd.next();
System.out.print("Enter Student's College ID : ");
collegeID[i]=sd.next();
System.out.print("Enter Student's Email : ");
email[i]=sd.next();
System.out.print("Enter Student's Phone Number : ");
phoneNumber[i]=sd.next();
System.out.print("Enter Student's D.O.B : ");
dob[i]=sd.next();
System.out.print("Enter Student's Sex : ");
sex[i]=sd.next();
System.out.print("Enter Student's Father Name : ");
fatherName[i]=sd.nextLine();
fatherName[i]=sd.nextLine();
System.out.print("Enter Student's Mother Name : ");
motherName[i]=sd.nextLine();
System.out.print("Enter Student's Address : ");
address[i]=sd.nextLine();
System.out.print("Enter Student's Blood Group : ");
bloodGroup[i]=sd.next();
System.out.print("Enter Student's University Roll Number : ");
universityRollNumber[i]=sd.next();
i++;
}
}
void display(){
for(int i=0;i<totalStdents;i++){
System.out.println("\t\t\t Student : "+(i+1));
System.out.println("  ");
System.out.println("Name : "+name[i]+" "+surname[i]);
System.out.println("College ID : "+collegeID[i]);
System.out.println("Email : "+email[i]);
System.out.println("Phone Number : "+phoneNumber[i]);
System.out.println("D.O.B : "+dob[i]);
System.out.println("Sex : "+sex[i]);
System.out.println("Father's Name : "+fatherName[i]);
System.out.println("Mother's Name : "+motherName[i]);
System.out.println("Address : "+address[i]);
System.out.println("Blood Group : "+bloodGroup[i]);
System.out.println("University Roll Number : "+universityRollNumber[i]);
System.out.println("  ");
}
}
void search(){
String cID;
System.out.println("Enter College ID : ");
cID=sd.next();
for(int i=0;i<totalStdents;i++){
if(cID.equals(collegeID[i])){
System.out.println("\t\t\t  Here's what we have found from our database  \t\t\t");
System.out.println("  ");
System.out.println("Name : "+name[i]+" "+surname[i]);
System.out.println("College ID : "+collegeID[i]);
System.out.println("Email : "+email[i]);
System.out.println("Phone Number : "+phoneNumber[i]);
System.out.println("D.O.B : "+dob[i]);
System.out.println("Sex : "+sex[i]);
System.out.println("Father's Name : "+fatherName[i]);
System.out.println("Mother's Name : "+motherName[i]);
System.out.println("Address : "+address[i]);
System.out.println("Blood Group : "+bloodGroup[i]);
System.out.println("University Roll Number : "+universityRollNumber[i]);
System.out.println("  ");
}
}
}
}
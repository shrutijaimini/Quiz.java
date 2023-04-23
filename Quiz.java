import java.io.*;
public class Quiz
{
String name,ch,ch1,ch2, ch3,ch4,ch5,ch6,ch7,ch8,ch9;
String c,c1,c2,c3,c4,c5,c6,c7,c8,c9;
String d,d1,d2,d3,d4,d5,d6,d7,d8,d9;
String e,e1,e2,e3,e4,e5,e6,e7,e8,e9;
int a,m,y,z,r,k;
InputStreamReader read= new InputStreamReader(System.in);
BufferedReader in= new BufferedReader(read);
void  intro()throws IOException
{
System.out.println("Welcome to our Quiz Competition");
System.out.println("Enter your name");
name=in.readLine();
System.out.println("Enter your roll no.");
r=Integer.parseInt(in.readLine());
System.out.println("Enter your age");
a= Integer.parseInt(in.readLine());
System.out.println("The quiz begins");
}
void  rules()throws IOException
{
System.out.println("There will be 4 rounds in the quiz each round contain 10 question");
System.out.println("5 qustions will be displayed first with 4 options you have to select 1 and have to enter it with full spelling");
 System.out.println("If out of 5 questions 3 are corect then next 5 will be displayed to you otherwise you have to go in second round");
 System.out.println("The process will continue and marks wii be given to you");
}
void round1()throws IOException
{
System.out.println("Your 1st 5 questions are as follows");
System.out.println("Q1. What is the colour of our blood?");
System.out.println(" Your options are A.RED B.BLUE C.GREEN D.YElLOW");
System.out.println("Enter your answer");
ch= in.readLine();
if(ch.equalsIgnoreCase("RED"))
{
System.out.println(" Your answer is correct"); 
k=k+1;
}
else
System.out.println(" Your answer is wrong"); 
System.out.println("Q2.Which is the longest cell in human body?");
System.out.println(" Your options are A.CELLS OF CHEEKS B. NERVE CELL C.LIVER CELLS D.NONE OF THE GIVEN");
System.out.println("Enter your answer");
ch1= in.readLine();
if(ch1.equalsIgnoreCase("NERVECELL"))
{
System.out.println(" Your answer is correct"); 
k=k+1;
}
else
System.out.println(" Your answer is wrong");
System.out.println("Q3.Who is known as the father of genetics?");
System.out.println(" Your options are A. LAMARCK B.DARWIN C.GREGOR JOHN D.MR.ROY");
System.out.println("Enter your answer");
ch2= in.readLine();
if(ch2.equalsIgnoreCase("GREGORJOHN"))
{
System.out.println(" Your answer is correct");
k=k+1; }
else
System.out.println(" Your answer is wrong");
System.out.println("Q.4 Who coined the term osmosis?");
System.out.println(" Your options are A. NOLLET B.DARWIN C.LAMARCKD.MR.ROY");
System.out.println("Enter your answer");
ch3= in.readLine();
if(ch3.equalsIgnoreCase("NOLLET"))
{
System.out.println(" Your answer is correct");
k=k+1; }
else
System.out.println(" Your answer is wrong"); 
System.out.println("Q.5 Who coined the term evolution?");
System.out.println(" Your options are A. HERBERT SPENCER  B.DARWIN C.LAMARCKD D.MR.ROY");
System.out.println("Enter your answer");
ch4= in.readLine();
if(ch4.equalsIgnoreCase("HERBERTSPENCER"))
{
System.out.println(" Your answer is correct");
k=k+1; } 
else
System.out.println(" Your answer is wrong"); 
if(k>=3)
{
System.out.println("Your next 5 questions are as follows");
System.out.println("Q.6 Who coined the term Homo Sapiens?");
System.out.println(" Your options are A. CARLOUS LINNAEUS B.DARWIN C.LAMARCKD D.MR.ROY");
System.out.println("Enter your answer?");
ch5= in.readLine();
if(ch5.equalsIgnoreCase("CARLOUSLINNAEUS"))

System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");

System.out.println("Q.7 Who was Lamarck?");
System.out.println(" Your options are A.BOTANIST B. ZOOLOGIST C. BOTH D.NONE");
System.out.println("Enter your answer");
ch6= in.readLine();
if(ch6.equalsIgnoreCase("BOTH"))

System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");
System.out.println("Q.8 Who was FW WENT? ");
System.out.println(" Your options are A. DUTCH BOTANIST B.DUTCH ZOOLOGIST C.NONE D.BOTH");
System.out.println("Enter your answer");
ch7= in.readLine();
if(ch7.equalsIgnoreCase("DUTCHBOTANIST"))

System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");

System.out.println("Q.9 Penicillin was discoverd by whom?");
System.out.println(" Your options are A. ALEXANDER FLEMING B.HOWARD FLEREY C.WAKSMAN D.NONE");
System.out.println("Enter your answer");
ch8= in.readLine();
if(ch8.equalsIgnoreCase("ALEXANDERFLEMING"))
System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");

System.out.println("Q.10 Who coined the trem antibiotics?");
System.out.println(" Your options are A. WAKSMAN B.DARWIN C.LAMARCKD D.MR.ROY");
System.out.println("Enter your answer");
ch9= in.readLine();
if(ch9.equalsIgnoreCase("WAKSMAN"))

System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");
}
else 
System.out.println("This round ends here for you");
}
void  round2()throws IOException
{
System.out.println("The second round begins");
System.out.println("Your 1st 5 questions are as follows");
System.out.println("Q.1 Which was the inventor of zero?");
System.out.println(" Your options are A. ARYABHATTA B.INSAT C.TES D.NONE");
System.out.println("Enter your answer");
c= in.readLine();
if(c.equalsIgnoreCase("ARYABHATTA"))
{
System.out.println(" Your answer is correct");
m=m+1;}
else
System.out.println(" Your answer is wrong");
System.out.println("Q.2 Who is called the prince of matheatics?");
System.out.println(" Your options are A.CARL FRIEDRICH B.RENE DISCARTES C.ARYABHATTA D. NONE");
System.out.println("Enter your answer");
c1= in.readLine();
if(c1.equalsIgnoreCase("CARLFRIEDRICH"))
{
System.out.println(" Your answer is correct");
m=m+1;}
else
System.out.println(" Your answer is wrong");
System.out.println("Q.3 What is the other name for describing zero?");
System.out.println(" Your options are A.NOUGHT B. ZETA C.BOTH D.NONE");
System.out.println("Enter your answer");
c2= in.readLine();
if(c2.equalsIgnoreCase("NOUGHT"))
{
System.out.println(" Your answer is correct");
m=m+1;}
else
System.out.println(" Your answer is wrong");
System.out.println("Q.4 Which award is presented in the field of mathematics?");
System.out.println(" Your options are A. NOBEL PRIZE B.ABEL PRIZE C.BOTH D.NONE");
System.out.println("Enter your answer");
c3= in.readLine();
if(c3.equalsIgnoreCase("ABELPRIZE"))
{
System.out.println(" Your answer is correct");
m=m+1;}
else
System.out.println(" Your answer is wrong");
System.out.println("Q.5 To which language does Algebra belong eytmologically?");
System.out.println(" Your options are A.PERSIAN  B.ARABIC C. BOTH D.NONE");
System.out.println("Enter your answer");
c4= in.readLine();
if(c4.equalsIgnoreCase("ARABIC"))
{
System.out.println(" Your answer is correct");
m=m+1;}
else
System.out.println(" Your answer is wrong");
if(m>=3)
{
System.out.println("Your next 5 questions are as follows");
System.out.println("Q.6 Which country Pythagoras a mathematician of?");
System.out.println(" Your options are A.GREECE B.FRANCE C.ENGLAND D.NONE");
System.out.println("Enter your answer");
c5= in.readLine();
if(c5.equalsIgnoreCase("GREECE"))
System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");
System.out.println("Q.7 Who was the inventor of mechanical calculator?");
System.out.println(" Your options are A.LORENZO MASCHERIQUE B.BLAISE PASCAL C.BOTH D.NONE");
System.out.println("Enter your answer");
c6= in.readLine();
if(c6.equalsIgnoreCase("BLAISEPASCAL"))

System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");
System.out.println("Q.8 What is the name of triangle in which all sides are of different lengts?");
System.out.println(" Your options are A. ISOSCELES TRIANGLE B.EQUILATERAL TRIANGLE C.ISOSCELES TRIANGLE D.NONE");
System.out.println("Enter your answer");
c7= in.readLine();
if(c7.equalsIgnoreCase("SCALENETRIANGLE"))
System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");
System.out.println("Q.9 Who was the writer of Arithmetica?");
System.out.println(" Your options are A. DIOPHANTUS B.SOCRATES C.BOTH D.NONE");
System.out.println("Enter your answer");
c8= in.readLine();
if(c8.equalsIgnoreCase("SOCRATES"))
System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");
System.out.println("Q.10 A type of mathematics in which letters and symbols are used?");
System.out.println(" Your options are A.ALGEBRA B.GEOMETRY C.BOTH D,NONE");
System.out.println("Enter your answer");
c9= in.readLine();
if(c9.equalsIgnoreCase("ALGEBRA"))
System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");}
else
System.out.println("This round ends here for you");
}
void round3()throws IOException
{
System.out.println("The third round begins");
System.out.println("Your 1st 5 questions are as follows");
System.out.println("Q.1 Who is the author of book Around the world in 80 days?");
System.out.println(" Your options are A.FORSTER B.JULES VERNE C.NONE D.BOTH");
System.out.println("Enter your answer");
d= in.readLine();
if(d.equalsIgnoreCase("JULESVERNE"))
{
System.out.println(" Your answer is correct");
z=z+1;}
else
System.out.println(" Your answer is wrong");
System.out.println("Q.2 Which Indian city is the office of SAHITYA ACADEMY situated in?");
System.out.println(" Your options are A. MUMBAI B.PUNE C.DELHI D.NAGPUR");
System.out.println("Enter your answer");
d1= in.readLine();
if(d1.equalsIgnoreCase("DELHI"))
{System.out.println(" Your answer is correct");
z=z+1;}
else
System.out.println(" Your answer is wrong");
System.out.println("Q.3 In which language did Mahadevi Verma write her book Vama?");
System.out.println(" Your options are A. SANSKRIT B.HINDI C.GUJARATI D.NONE");
System.out.println("Enter your answer");
d2= in.readLine();
if(d2.equalsIgnoreCase("HINDI"))
{System.out.println(" Your answer is correct");
z=z+1;}
else
System.out.println(" Your answer is wrong");

System.out.println("Q.4 Who is the writer of Half a life?");
System.out.println(" Your options are A.VS NAIPAL B.JULES VERNE C.NONE D.BOTH");
System.out.println("Enter your answer");
d3= in.readLine();
if(d3.equalsIgnoreCase("VSNAIPAL"))
{System.out.println(" Your answer is correct");
z=z+1;}
else
System.out.println(" Your answer is wrong");
System.out.println("Q.5 Who is the author of A passage to India?");
System.out.println(" Your options are A.EM FORSTER B.VS NAIPAL C.NONE D.BOTH");
System.out.println("Enter your answer");
d4= in.readLine();
if(d4.equalsIgnoreCase("EMFORSTER"))
{System.out.println(" Your answer is correct");
z=z+1;}
else
System.out.println(" Your answer is wrong");
 if(z>=3)
 {
 System.out.println("Your next 5 questions are as follows");
System.out.println("Q.6 Who wrote a A tale of two citizens? ");
System.out.println(" Your options are A.JULES VERNE B. CHARLES DICKENS C.NONE .D.BOTH");
System.out.println("Enter your answer");
d5= in.readLine();
if(d5.equalsIgnoreCase("CHARLESDICKENS"))
System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong"); 
 System.out.println("Q.7 Which writer wrote the short story Rip Van Winkle? ");
 System.out.println(" Your options are A.WASHINGTON IRVING B.ARAVIND ADIGA C.FORSTER D.NONE");
 System.out.println("Enter your answer");
d6= in.readLine();
if(d6.equalsIgnoreCase("WASHINGTONIRVING"))
System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");
 System.out.println("Q.8 Who is the writer of THE WHITE TIGER?");
 System.out.println(" Your options are A.WASHINGTON IRVING B FORSTER C.ARAVIND ADIGA D.NONE");
  System.out.println("Enter your answer");
d7= in.readLine();
 if(d7.equalsIgnoreCase("ARAVINDADIGA"))
System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");
 System.out.println("Q.9 Who is the author of best selling book Lajja?");
 System.out.println(" Your options are A.TASLIMA NOSRIN B.WASHINGTON IRVING C.BOTH D.NONE");
  System.out.println("Enter your answer");
d8= in.readLine();
 if(d8.equalsIgnoreCase("TASLIMANOSRIN"))
System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");
System.out.println("Q.10 Which award is known as the alternative Nobel Prize?");
  System.out.println(" Your options are A.THERIGHT LIVELIHAT AWARD B.ABEL PRIZE C. MEN BOKER PRIZE D.NONE");
   System.out.println("Enter your answer");
d9= in.readLine();
 if(d9.equalsIgnoreCase("THERIGHTLIVELIHATAWARD"))
System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");
}
else 
System.out.println("This round ends here for you");
}
void  round4()throws IOException
{
System.out.println("The fourth round begins");
System.out.println("Your 1st 5 questions are as follows");
System.out.println("Q.1 Who is called the father of computer?");
System.out.println(" Your options are A. GALILEO GALILEI B.CHARLES BABBAGE C.P.C RAY D.NONE");
 System.out.println("Enter your answer");
e= in.readLine();
if(e.equalsIgnoreCase("CHARLESBABBAGE"))
{System.out.println(" Your answer is correct");
y=y+1;}
else
System.out.println(" Your answer is wrong");
 System.out.println("Q.2 Who is called the father of medicine?");
 System.out.println(" Your options are A.HIPPOCRATES B.EUCLID C.PC RAY D.NONE");
 System.out.println("Enter your answer");
e1= in.readLine();
if(e1.equalsIgnoreCase("HIPPOCRATES"))
{System.out.println(" Your answer is correct");
y=y+1;}
else
System.out.println(" Your answer is wrong");
System.out.println("Q.3 Who is called the father of SCIENCE ?");
  System.out.println(" Your options are A.EUCLID B.GALILEO GALILEI C.CHARLES BABBAGE D.P.C RAY ");
  System.out.println("Enter your answer");
e2= in.readLine();
if(e2.equalsIgnoreCase("GALILEOGALILEI"))
{System.out.println(" Your answer is correct");
y=y+1;}
else
System.out.println(" Your answer is wrong");
System.out.println("Q.4 Who is called the father of Biology?");
 System.out.println(" Your options are A.ARISTOTLE B.GREGOR MENDEL C.CHARLES BABBAGE D.NONE");
 System.out.println("Enter your answer");
e3= in.readLine();
if(e3.equalsIgnoreCase("ARISTOTLE"))
{System.out.println(" Your answer is correct");
y=y+1;}
else
System.out.println(" Your answer is wrong");
System.out.println("Q.5Who is called the father of Geometry?");
System.out.println(" Your options are A.ARISTOTLE B.GREGOR MENDEL C.EUCLID D.NONE");
 System.out.println("Enter your answer");
e4= in.readLine();
if(e4.equalsIgnoreCase("EUCLID"))
{
System.out.println(" Your answer is correct");
y=y+1;
}
else
System.out.println(" Your answer is wrong");
if(y>=3)
{
 System.out.println("Your next 5 questions are as follows");
 System.out.println("Q.6Who is called the father of Buyoancy ?");
  System.out.println(" Your options are A.EUCLID B.GALILEO GALILEI C.CHARLES BABBAGE D.ARCHIMEDES");
  System.out.println("Enter your answer");
e5= in.readLine();
if(e5.equalsIgnoreCase("ARCHIMEDES"))
System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");
 System.out.println("Q.7Who is called the father of Indian Chemistry?");
 System.out.println(" Your options are A.GALILEO GALILEI B.PC RAY C.EUCLID D.GEOFFREY CHAUCER");
 System.out.println("Enter your answer");
e= in.readLine();
if(e6.equalsIgnoreCase("PCRAY"))
System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");
System.out.println("Q.8Who is called the father of HOMEOPATHY?");
System.out.println(" Your options are A.HANEMANN B.THEOPHRATUS C.CHAUCER D.NONE");
System.out.println("Enter your answer");
e7= in.readLine();
if(e7.equalsIgnoreCase("HANEMANN"))
System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");
System.out.println("Q.9 Who is called the father of PSYCHOLOGY?");
System.out.println(" Your options are A.HANEMANN B.THEOPHRATUS C.CHAUCER  D.SIGMUND FREUD");
System.out.println("Enter your answer");
e8= in.readLine();
if(e8.equalsIgnoreCase("SIGMUNDFREUD"))
System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");
System.out.println("Q.10 Who is called the father of English poetry ?");
System.out.println(" Your options are A.EUCLID B.GALILEO GALILEI C.CHARLES BABBAGE D.GEOFFREY CHAICER");
System.out.println("Enter your answer");
e9= in.readLine();
if(e9.equalsIgnoreCase("GEOFFREYCHAICER"))
System.out.println(" Your answer is correct");
else
System.out.println(" Your answer is wrong");
}
else
System.out.println("This round ends here for you");
}
void  result()throws IOException
{
if(y>=3&&z>=3&&m>=3&&k>=3)
System.out.println("Passed with first divison");
if(y>=3&&z>=3||m>=3&&k>=3)
System.out.println("Passed with second divison");
if(y>=3||z>=3||k>=3||m>=3)
System.out.println("Passed with third divison");
else
System.out.println("You are fail");
}
public static void main(String args[])throws IOException
{
Quiz ob=new Quiz();
ob.intro();
ob.rules();
ob.round1();
ob.round2();
ob.round3();
ob.round4();
ob.result();
}
}
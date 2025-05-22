import ExamSubject.SubjectName;

public class Candidate {
  private ExamSubject[] subjects;
  

public Candidate(){
  this.subjects = new ExamSubject[3];
}

public void attendEnglishExam(){
  this.subjects[0]=ExamSubject.ofEnglish();
}

public void attendMathsExam(){
  this.subjects[2]=ExamSubject.ofMATHS();
}
public void attendHistoryExam(){
  this.subjects[1]=ExamSubject.ofHISTORY();
}

public ExamSubject getEnglishSubject() {
  return this.subjects[0];
}

public int getEnglishScore(){
  if(this.subjects[0]!=null){
  return this.subjects[0].getScore();
}else{
  System.out.println("the candidate didn't attend the English Exam");
  return -1;
}
}


public int getMATHSScore(){
  if(this.subjects[2]!=null){
  return this.subjects[2].getScore();
}else{
  System.out.println("the candidate didn't attend the Maths Exam");
  return -1;
}
}

public int getHISTORYScore(){
  if(this.subjects[1]!=null){
  return this.subjects[1].getScore();
}else{
  System.out.println("the candidate didn't attend the History Exam");
  return -1;
}
}


public void setEnglish(int score){
  if(this.subjects[0]!=null){
  this.subjects[0].setScore(score);
}else{
  System.out.println("the candidate didn't attend the English Exam");
}
}

public void setMATHS(int score){
  if(this.subjects[1]!=null){
  this.subjects[1].setScore(score);
}else{
  System.out.println("the candidate didn't attend the Maths Exam");
}
}

public void setHISTORY(int score){
  if(this.subjects[2]!=null){
  this.subjects[2].setScore(score);
}
}








public static void main(String[] args) {
  
  Candidate canA = new Candidate();
  canA.setEnglish(80);
  canA.setMATHS(90);
  canA.setHISTORY(45);
  canA.attendEnglishExam();
  canA.attendMathsExam();
  canA.attendHistoryExam();

  Candidate canB = new Candidate();
  canB.setEnglish(80);
  canB.setMATHS(80);
  canB.setHISTORY(80);
  canB.attendEnglishExam();
  canB.attendMathsExam();
  canB.attendHistoryExam();

  System.out.println(canA.getHISTORYScore());//45
  System.out.println(canB.getHISTORYScore());//80

System.out.println(canA.getEnglishSubject().equals(canB.getEnglishSubject()));//false
System.out.println(canA.getEnglishSubject().equals(canA.getEnglishSubject()));//true

System.out.println(canA.getEnglishSubject().getId());
System.out.println(canB.getEnglishSubject().getId());

}
}

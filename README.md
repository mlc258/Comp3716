CS3716
======

Repository for Computer Science 3716 Final Project

Group E:
Austin Torraville,
Dylan Chrysochou,
Michelle Croke,
Tyson Duffenais

To run what we have as of our Implementation 2:
Run the SystemUI.java class to test the System.

All classes are used by the system, we have two testing classes named 'GeneratorTest.java' and 
'ParameterStratTest.java' for personal tests to debug any problems with our group-generating strategies.
As of now, our ResponseUI (for students to respond) doesn't actually add a student response because 
we haven't implemented users. However, we call a method to simulate students responding instead.
If the code commented out in QuestionsUI.java (for instructor to add questions) is changed, our 
QuestionsUI will open a ResponseUI for each student since it isn't multithreaded. The lines in question 
are as follows:

//For each student, open ResponseUI to get their responses 
//Would ideally have a thread for each student instead. (Uncomment this)
for(Student student: system.students){
  rUI = new ResponseUI(system, student);
  rUI.setVisible(true);
}

//Comment this
rUI = new ResponseUI(system);
rUI.setVisible(true);


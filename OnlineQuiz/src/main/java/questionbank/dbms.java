package questionbank;
public class dbms {
    
    
    
public static String dbms[]={" What is the component of a DBMS that is responsible for storing, retrieving, and updating data? ",
" The tool which assists in generating input screens is referred to as: ",

" The ability to modify the data structure and not have to change the programs using that data is called:",
" Which of the following items is not a DBMS:",
" The database design that uses a hierarchical data structure, but incorporates multiple data entry points is called a:",
" Which of the following is an extension of the Relational Database model?",
" What is the main strength of Relational Databases?",
" Which component of the database management system (DBMS) most affects the performance (speed)?",
" Data integrity can be improved by which of the following means ____________.",
" The role of the query system is to:",
" Which of the following items is not the advantage of a DBMS? ",
" The term referring to a physical item existing in the real world that you want to track is called:",
" Two different terms are used to describe the characteristics of interest for an entity. They are properties and:",
" The term used for the functions and procedures that work on class data is:",
" The database model that utilizes multiple tables interconnected through common attributes to store and manage information is called a:",
" The process to properly define the database tables to provide flexibility, minimize redundancy, and ensure data integrity is called:",
" The Unified Modeling Language (UML) is :",
" If there is a relationship between two tables, this indicates that",
" An n-ary relationship is drawn using which symbol:",
" An aggregation association is drawn using which symbol:",
" A generalization association is drawn using which symbol: ",
" Assume you are creating a database to handle the data associated with instruction at a university. What is the most appropriate special association to model that a students schedule consists of multiple classes? ",
" Assume you are creating a database to handle the data associated with instruction at a university. What is the most appropriate special association to model the different elements contained in each classroom (i.e., projection equipment, blackboard type, computer support, etc)? ",
" Assume you are creating a database to handle the data associated with instruction at a university. What is the most appropriate special association to model that a course may be of different types (i.e., lectures, seminars, labs, independent study, field research, etc.)? ",
" If every non key attribute is functionally depend upon key attribute then relation in th normal form?",
" What is the special association that combines different items from multiple classes to build a new object? ",
" A generalization association supports inheritance, where:",
" The process of defining and bundling all of the properties and functions into a class is called:",
" Missing data in a field: ",
" In a university environment, what is the appropriate multiplicity for an association linking courses with their list of pre-requisite courses? Focus on the numbers placed next to the Pre-requisite courses  side of the association.",
" Which of the following  is not  correct?",
" Which of the following statements is not correct?",
" Which of the following statements is not correct?",
" Column of tables are referred as-",
" Which of the following descriptions is incorrect?  ",
" Which of the following  is not a name of level  ?",
" Which of the following descriptions is incorrect? ",
" Which of the following descriptions about relational data model is incorrect?  ",
" Which of the following descriptions is incorrect?  ",
" Which of the following descriptions is incorrect?"};


public static String dbmschoice[][]={
{"data dictionary",  
 "data management engine", 
  "database engine", 
  "query engine"},

{"data dictionary", 
  "forms generator",
  "input screen tool",  
 "report generator"},

{"data dictionary ", 
 "data independence",
   "data integrity",   
"referential integrity"},

{"Access",  
 "Acrobat Reader",  
 "Oracle",   
"SQL Server"},

{" Hierarchical database", 
  "Network database",
  " Object oriented database ",
 " Relational database "},

{"Hierarchical database", 
  "Multidimensional database ",
   "Network database", 
  "Object oriented database"},

{"Ability to handle any type of data", 
  "Defining objects provides for reuse of data definitions",  
 "Ease of use",  
 "Flexibility and efficiency in accessing data"},

{"Data Storage Subsystem", 
 "Database Engine",
  " Query Processor ", 
 "Security Subsystem "},

{"adding indexes",
   "entering appropriate terms into the data dictionary",
   "incorporating business rules when defining the data",  
 "using inheritance"},

{"present the data in a user friendly format", 
  "provide data security", 
  "retrieve and manipulate data", 
  "support data integrity"},

{" Data Independence ",
  "Decentralized administration of the data",
   "Ease of application development",
   "Uniform security, privacy and integrity"},

{"class",  
 "entity",  
 "object", 
  "table"},

{"attributes",
 "classes",  
 "entities",
   "traits"},

{"attributes ",
  "entity",   
"methods",
   "objects"},

{"Class Database ", 
 "Matrix Database",
   "Network Database", 
  "Relational Database"},

{"class diagram",  
 "data normalization",
   "database design", 
  "design rationalization"},

{"a set of standards that address how information should be modeled ",  
"international standard language used to develop databases ",
  "language used for web enabled database",
  "set of tools used to connect databases operating under different database systems "},

{"information from both tables is always used together",
   "the data contained in the two tables are related to each other in some way ",
  "the data from one table is inherited from the other table",
   "the structure of the one table is inherited from the other table"},

{"a diamond ",
  "a line with arrows",
   "a line without arrows", 
  "a rectangle"},

{"a line which loops back onto the same table", 
  "small closed diamond ",  
"small open diamond", 
   "small triangle "},

{"a line ",
   "small closed diamond",
 "small open diamond", 
 "small triangle"},

{"aggregation association",
   "generalization association ",
  "n-ary association", 
  "reflexive association"},

{"composition association",
   "generalization association",
   "n-ary association",
   "reflexive association "},

{"aggregation association", 
  "generalization association",
   "n-ary association ",
  "reflexive association"},

{" First normal form",
" Second normal form",
" Third normal form",
"Fourth normal form "},

{"composition association", 
  "generalization association", 
  "n-ary association", 
  "reflexive association"},

{"higher level classes gain the properties and functions of the lower class",  
 "lower level classes all have different properties and functions",
   "lower level classes all have the same properties and functions",  
 "lower level classes gain the properties and functions of a higher class"},

{"database design", 
  "encapsulation", 
  "inheritance", 
  "polymorphism"},

{"is a null value", 
  "is illegal",  
 "will cause a warning", 
  "will cause an error"},

{" 0..* ", 
  "1..* ", 
  "0..1",  
  "1..1 "},

{"DDL=Data definition language",
"DML=Data manipulation language",
"DQL=Data Quotient language",
"TCL=Transition control language"},

{"Data normalization minimizes data redundancy", 
 "Normalisation means decomposition of tables.",   
"There can be inserion,deletion and updation anaomly.", 
 " To remove data dependencies we use normalisation "},

{"Data normalization improves the data integrity of a database",   
"A reflexive association is a relationship from one class back to itself",   
"An entity is the database representation of a real world class",   
"none"},

{"  Tuple",
" Attribute",
" Entity",
" Degree"},

{" foreign key is a constraint",
  "Data query language enables the DBA to define the data type",
   "TRUNCATE and DELETE are same.",
   "Select comes under DQL"},

{" Conceptual Level",
" View Level",
" Physical Level",
" All are correct."},

{"The conceptual data model of a database covers the physical implementation of the database to achieve the optimal runtime performance and storage space utilization",
   "A major objective for the three-level architecture is to provide data independence",
   "A system catalog, or data dictionary, is a repository of information describing the data in the database",
   "The method component of an object defines the actions of the object."},

{"Each cell of a table contains only one atomic value", 
  "A database is perceived by the user as tables",  
 "The information contained in a single class would be stored in a tuple",  
 "There are no duplicate tuples"},

{" There can be one PRIMARY KEY within a table.",
" UNIQUE +NOT NULL=PRIMARY KEY",
" Foreign key will be sureley a primary key.",
" Primary key may contain null values."},

{"Data dictionary is a repository of information describing the data in the database ",  
"A constraint is a rule that is enforced on the data ",  
"Data manipulation language is a set of commands used to alter the data in a database",   
"Data flow diagram signifies the quantities involved in an association"}
};

public static String dbmsanswer[]={"B","B","B","B","D","D","B","C","C","B","B","A","C","D","D","A","B","A","C","D","A","A","B","C","D","D","B","A","A","D","C","D","D","B","C","D","A","C","D","A"};


    
    
}

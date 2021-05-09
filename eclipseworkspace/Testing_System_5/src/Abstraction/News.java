package Abstraction;

public class News implements INews{
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	private int[] array;
	
	
	public int[] getArray() {
		return array;
	}
	public void setArray(int a,int b, int c) {
		array = new int[3];
		this.array[0] = a;
		this.array[1] = b;
		this.array[2] = c;
		
	}
//	// overload setArray
//	public int[] setArray(int a, int b, int c){
//		int[] arr = {a,b,c};
//		return arr;
//	}
	public News() {
	}
	public News(String title, String publishDate, String author, String content) {
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getPublishDate(){
		return publishDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getAverageRate() {
		return averageRate;
	}
	@Override
	public void display() {
		System.out.println("Title : " + getTitle() +
				"\nPublish Date : " + getPublishDate()+
				"\nAuthor : " + getAuthor() + 
				"\nContent : "+ getContent() + 
				"\nAverage Rate : " + getAverageRate());
		
	}
	public void calculate(int a, int b, int c){
		this.averageRate = (a+b+c)/3f;
	}
	
//	public String toString(){
//		return "id : " + getId() +
//				"\ntitle : " + getTitle() +
//				"\nPublish Date : " + getPublishDate() +
//				"\nAuthor : " + getAuthor() +
//				"\nContent : " + getContent() +
//				"\nAverage Rate : " + getAverageRate();
//	}
}

package GenericLibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public BasePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		@FindBy(linkText = "Books")
		private WebElement Bookspge;
		@FindBy(linkText = "Bestseller")
		private WebElement Bestsellerpge;
		@FindBy(linkText = "Cook and enjoy")
		private WebElement CookandenjoyElmnt;
		@FindBy(id = "artlist-action-sort")
		private WebElement sortBy;
		@FindBy(xpath = "//span[contains(text(),'$10.00')]")
		private WebElement price10;
		@FindBy(xpath = "//span[contains(text(),'$25.00')]")
		private WebElement price25;
		@FindBy(xpath ="//span[contains(text(),'$50.00')]" )
		private WebElement price50;
		@FindBy(xpath ="//span[contains(text(),'$100.00')]" )
		private WebElement price100;
		@FindBy(xpath ="//span[contains(text(),'$250.00')]" )
		private WebElement price250;
		@FindBy(xpath ="//span[contains(text(),'$500.00')]" )
		private WebElement price500;
		@FindBy(xpath ="//span[contains(text(),'$1000')]" )
		private WebElement price1000;
		@FindBy(xpath = "//option[text()='Name: Z to A']")
		private WebElement feautured;
		@FindBy(xpath = "//option[text()='Name: A to Z']")
		private WebElement feautured1;
		@FindBy(xpath = "//span[text()='Compare']")
		private WebElement compare;
		@FindBy(xpath = "//span[text()='Wish']")
		private WebElement wish1;
		@FindBy(xpath = "//strong[text()='Cart']")
		private WebElement shpngcrt;
		@FindBy(xpath = "//a[contains(text(),'Go to cart')]")
		private WebElement goingTocart;
		//@FindBy(xpath = "//span[text()='View Wishlist']")
		//private WebElement removed;
		//public WebElement getRemoved() {
			//return removed;
		//}
		@FindBy(xpath = "//span[text()='View Wishlist']")
		private WebElement view;
		@FindBy(xpath = "//a[contains(text(),'Forums')]")
		private WebElement forums;
		public WebElement getForums() {
			return forums;
		}
		public WebElement getView() {
			return view;
		}
		public WebElement getGoingTocart() {
			return goingTocart;
		}
		public WebElement getShpngcrt() {
			return shpngcrt;
		}
		public WebElement getCompare() {
			return compare;
		}
		public WebElement getWish1() {
			return wish1;
		}
		public WebElement getFeautured() {
			return feautured;
		}
		public void setFeautured(WebElement feautured) {
			this.feautured = feautured;
		}
		public WebElement getFeautured1() {
			return feautured1;
		}
		public void setFeautured1(WebElement feautured1) {
			this.feautured1 = feautured1;
		}
		public WebElement getBookspge() {
			return Bookspge;
		}
		public void setBookspge(WebElement bookspge) {
			Bookspge = bookspge;
		}
		public WebElement getBestsellerpge() {
			return Bestsellerpge;
		}
		public void setBestsellerpge(WebElement bestsellerpge) {
			Bestsellerpge = bestsellerpge;
		}
		public WebElement getCookandenjoyElmnt() {
			return CookandenjoyElmnt;
		}
		public void setCookandenjoyElmnt(WebElement cookandenjoyElmnt) {
			CookandenjoyElmnt = cookandenjoyElmnt;
		}
		public WebElement getSortBy() {
			return sortBy;
		}
		public void setSortBy(WebElement sortBy) {
			this.sortBy = sortBy;
		}
		public WebElement getPrice10() {
			return price10;
		}
		public void setPrice10(WebElement price10) {
			this.price10 = price10;
		}
		public WebElement getPrice25() {
			return price25;
		}
		public void setPrice25(WebElement price25) {
			this.price25 = price25;
		}
		public WebElement getPrice50() {
			return price50;
		}
		public void setPrice50(WebElement price50) {
			this.price50 = price50;
		}
		public WebElement getPrice100() {
			return price100;
		}
		public void setPrice100(WebElement price100) {
			this.price100 = price100;
		}
		public WebElement getPrice250() {
			return price250;
		}
		public void setPrice250(WebElement price250) {
			this.price250 = price250;
		}
		public WebElement getPrice500() {
			return price500;
		}
		public void setPrice500(WebElement price500) {
			this.price500 = price500;
		}
		public WebElement getPrice1000() {
			return price1000;
		}
		public void setPrice1000(WebElement price1000) {
			this.price1000 = price1000;
		}
		}
		



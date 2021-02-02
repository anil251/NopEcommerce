package com.automation.Pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Customers {
WebDriver rdriver;
	
	public void Customers(WebDriver ldriver) {
		rdriver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	public class AddNewCustomer {
	    private Map<String, String> data;
	    private WebDriver driver;
	    private int timeout = 15;

	    @FindBy(css = "a[href='/Admin/Security/Permissions']")
	    @CacheLookup
	    private WebElement accessControlList;

	    @FindBy(id = "Active")
	    @CacheLookup
	    private WebElement active;

	    @FindBy(css = "a[href='/Admin/ActivityLog/ActivityLogs']")
	    @CacheLookup
	    private WebElement activityLog;

	    @FindBy(css = "a[href='/Admin/ActivityLog/ActivityTypes']")
	    @CacheLookup
	    private WebElement activityTypes;

	    @FindBy(css = "input.form-control.admin-search-box.typeahead.tt-input")
	    @CacheLookup
	    private WebElement adminComment1;

	    @FindBy(id = "AdminComment")
	    @CacheLookup
	    private WebElement adminComment2;

	    @FindBy(css = "a[href='/Admin/Affiliate/List']")
	    @CacheLookup
	    private WebElement affiliates;

	    @FindBy(css = "a[href='/Admin/Plugin/OfficialFeed']")
	    @CacheLookup
	    private WebElement allPluginsAndThemes;

	    @FindBy(css = "a[href='/Admin/Setting/AllSettings']")
	    @CacheLookup
	    private WebElement allSettingsAdvanced;

	    @FindBy(css = ".skin-blue.sidebar-mini div:nth-of-type(3) div:nth-of-type(2) div.sidebar ul.sidebar-menu.tree li:nth-of-type(2) ul.treeview-menu li:nth-of-type(6) a")
	    @CacheLookup
	    private WebElement attributes;

	    @FindBy(css = ".skin-blue.sidebar-mini div:nth-of-type(3) div:nth-of-type(3) div form div:nth-of-type(1) h1.pull-left small a")
	    @CacheLookup
	    private WebElement backToCustomerList;

	    @FindBy(css = "a[href='/Admin/Report/Bestsellers']")
	    @CacheLookup
	    private WebElement bestsellers;

	    @FindBy(css = "a[href='/Admin/Blog/BlogComments']")
	    @CacheLookup
	    private WebElement blogComments;

	    @FindBy(css = "a[href='/Admin/Blog/BlogPosts']")
	    @CacheLookup
	    private WebElement blogPosts;

	    @FindBy(css = "a[href='/Admin/Setting/Blog']")
	    @CacheLookup
	    private WebElement blogSettings;

	    @FindBy(css = "a[href='/Admin/Campaign/List']")
	    @CacheLookup
	    private WebElement campaigns;

	    @FindBy(css = ".skin-blue.sidebar-mini div:nth-of-type(3) div:nth-of-type(2) div.sidebar ul.sidebar-menu.tree li:nth-of-type(2) a")
	    @CacheLookup
	    private WebElement catalog;

	    @FindBy(css = "a[href='/Admin/Setting/Catalog']")
	    @CacheLookup
	    private WebElement catalogSettings;

	    @FindBy(css = "a[href='/Admin/Category/List']")
	    @CacheLookup
	    private WebElement categories;

	    @FindBy(css = "a[href='/Admin/CheckoutAttribute/List']")
	    @CacheLookup
	    private WebElement checkoutAttributes;

	    @FindBy(css = "button.bg-dark")
	    @CacheLookup
	    private WebElement clearCache;

	    @FindBy(css = "a[href='https://www.nopcommerce.com/boards?utm_source=admin-panel&utm_medium=menu&utm_campaign=admin-panel']")
	    @CacheLookup
	    private WebElement communityForums;

	    @FindBy(id = "Company")
	    @CacheLookup
	    private WebElement companyName;

	    @FindBy(css = ".skin-blue.sidebar-mini div:nth-of-type(3) div:nth-of-type(2) div.sidebar ul.sidebar-menu.tree li:nth-of-type(7) a")
	    @CacheLookup
	    private WebElement configuration;

	    @FindBy(css = ".skin-blue.sidebar-mini div:nth-of-type(3) div:nth-of-type(2) div.sidebar ul.sidebar-menu.tree li:nth-of-type(6) a")
	    @CacheLookup
	    private WebElement contentManagement;

	    @FindBy(css = "a[href='/Admin/Country/List']")
	    @CacheLookup
	    private WebElement countries;

	    @FindBy(css = "a[href='/Admin/Report/CountrySales']")
	    @CacheLookup
	    private WebElement countrySales;

	    @FindBy(css = "a[href='/Admin/Currency/List']")
	    @CacheLookup
	    private WebElement currencies;

	    @FindBy(css = ".skin-blue.sidebar-mini div:nth-of-type(3) div:nth-of-type(2) div.sidebar ul.sidebar-menu.tree li:nth-of-type(9) ul.treeview-menu li:nth-of-type(5) a")
	    @CacheLookup
	    private WebElement customerReports;

	    @FindBy(css = "a[href='/Admin/CustomerRole/List']")
	    @CacheLookup
	    private WebElement customerRoles1;

	    @FindBy(css = "#customer-info div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(10) div:nth-of-type(2) div.input-group.input-group-required div:nth-of-type(1) div.k-multiselect-wrap.k-floatwrap input.k-input")
	    @CacheLookup
	    private WebElement customerRoles2;

	    @FindBy(id = "SelectedCustomerRoleIds")
	    @CacheLookup
	    private WebElement customerRoles3;

	    @FindBy(css = "a[href='/Admin/Setting/CustomerUser']")
	    @CacheLookup
	    private WebElement customerSettings;

	    @FindBy(css = ".skin-blue.sidebar-mini div:nth-of-type(3) div:nth-of-type(2) div.sidebar ul.sidebar-menu.tree li:nth-of-type(4) a")
	    @CacheLookup
	    private WebElement customers1;

	    @FindBy(css = ".skin-blue.sidebar-mini div:nth-of-type(3) div:nth-of-type(2) div.sidebar ul.sidebar-menu.tree li:nth-of-type(4) ul.treeview-menu li:nth-of-type(1) a.menu-item-link")
	    @CacheLookup
	    private WebElement customers2;

	    @FindBy(css = "a[href='/Admin/Report/BestCustomersByNumberOfOrders']")
	    @CacheLookup
	    private WebElement customersByNumberOfOrders;

	    @FindBy(css = "a[href='/Admin/Report/BestCustomersByOrderTotal']")
	    @CacheLookup
	    private WebElement customersByOrderTotal;

	    @FindBy(css = ".skin-blue.sidebar-mini div:nth-of-type(3) div:nth-of-type(2) div.sidebar ul.sidebar-menu.tree li:nth-of-type(1) a.menu-item-link")
	    @CacheLookup
	    private WebElement dashboard;

	    @FindBy(id = "DateOfBirth")
	    @CacheLookup
	    private WebElement dateOfBirth;

	    @FindBy(css = "a[href='/Admin/Shipping/DatesAndRanges']")
	    @CacheLookup
	    private WebElement datesAndRanges;

	    @FindBy(css = "a[href='/Admin/Discount/List']")
	    @CacheLookup
	    private WebElement discounts;

	    @FindBy(id = "Email")
	    @CacheLookup
	    private WebElement email;

	    @FindBy(css = "a[href='/Admin/EmailAccount/List']")
	    @CacheLookup
	    private WebElement emailAccounts;

	    @FindBy(css = "a[href='/Admin/ExternalAuthentication/Methods']")
	    @CacheLookup
	    private WebElement externalAuthentication;

	    @FindBy(id = "FirstName")
	    @CacheLookup
	    private WebElement firstName;

	    @FindBy(css = "a[href='/Admin/Setting/Forum']")
	    @CacheLookup
	    private WebElement forumSettings;

	    @FindBy(css = "a[href='/Admin/Forum/List']")
	    @CacheLookup
	    private WebElement forums;

	    @FindBy(css = "a[href='/Admin/Customer/GdprLog']")
	    @CacheLookup
	    private WebElement gdprRequestsLog;

	    @FindBy(css = "a[href='/Admin/Setting/Gdpr']")
	    @CacheLookup
	    private WebElement gdprSettings;

	    @FindBy(name = "Gender")
	    @CacheLookup
	    private List<WebElement> gender1;

	    @FindBy(name = "Gender")
	    @CacheLookup
	    private List<WebElement> gender2;

	    private final String gender1Value = "M";

	    private final String gender2Value = "F";

	    @FindBy(css = "a[href='/Admin/Setting/GeneralCommon']")
	    @CacheLookup
	    private WebElement generalSettings;

	    @FindBy(css = "a[href='/Admin/GiftCard/List']")
	    @CacheLookup
	    private WebElement giftCards;

	    @FindBy(css = ".skin-blue.sidebar-mini div:nth-of-type(3) div:nth-of-type(2) div.sidebar ul.sidebar-menu.tree li:nth-of-type(10) a")
	    @CacheLookup
	    private WebElement help;

	    @FindBy(css = "a[href='https://docs.nopcommerce.com?utm_source=admin-panel&utm_medium=menu&utm_campaign=admin-panel']")
	    @CacheLookup
	    private WebElement helpTopics;

	    @FindBy(id = "IsTaxExempt")
	    @CacheLookup
	    private WebElement isTaxExempt;

	    @FindBy(css = "a[href='/Admin/Language/List']")
	    @CacheLookup
	    private WebElement languages;

	    @FindBy(id = "LastName")
	    @CacheLookup
	    private WebElement lastName;

	    @FindBy(css = "a[href='/Admin/Plugin/List']")
	    @CacheLookup
	    private WebElement localPlugins;

	    @FindBy(css = "a[href='/Admin/Log/List']")
	    @CacheLookup
	    private WebElement log;

	    @FindBy(css = "a[href='/logout']")
	    @CacheLookup
	    private WebElement logout;

	    @FindBy(css = "a[href='/Admin/Report/LowStock']")
	    @CacheLookup
	    private WebElement lowStock;

	    @FindBy(css = "a[href='/Admin/Common/Maintenance']")
	    @CacheLookup
	    private WebElement maintenance;

	    @FindBy(id = "VendorId")
	    @CacheLookup
	    private WebElement managerOfVendor;

	    @FindBy(css = "a[href='/Admin/Manufacturer/List']")
	    @CacheLookup
	    private WebElement manufacturers;

	    @FindBy(css = "a[href='/Admin/Measure/List']")
	    @CacheLookup
	    private WebElement measures;

	    @FindBy(css = "a[href='/Admin/Setting/Media']")
	    @CacheLookup
	    private WebElement mediaSettings;

	    @FindBy(css = "a[href='/Admin/QueuedEmail/List']")
	    @CacheLookup
	    private WebElement messageQueue;

	    @FindBy(css = "a[href='/Admin/MessageTemplate/List']")
	    @CacheLookup
	    private WebElement messageTemplates;

	    @FindBy(css = "a[href='/Admin/News/NewsComments']")
	    @CacheLookup
	    private WebElement newsComments;

	    @FindBy(css = "a[href='/Admin/News/NewsItems']")
	    @CacheLookup
	    private WebElement newsItems;

	    @FindBy(css = "a[href='/Admin/Setting/News']")
	    @CacheLookup
	    private WebElement newsSettings;

	    @FindBy(css = "input.k-input.k-readonly")
	    @CacheLookup
	    private WebElement newsletter1;

	    @FindBy(id = "SelectedNewsletterSubscriptionStoreIds")
	    @CacheLookup
	    private WebElement newsletter2;

	    @FindBy(css = "a[href='/Admin/NewsLetterSubscription/List']")
	    @CacheLookup
	    private WebElement newsletterSubscribers;

	    @FindBy(css = "a[href='https://www.nopcommerce.com/?utm_source=admin-panel&utm_medium=footer&utm_campaign=admin-panel']")
	    @CacheLookup
	    private WebElement nopcommerce;

	    @FindBy(css = "a[href='/Admin/OnlineCustomer/List']")
	    @CacheLookup
	    private WebElement onlineCustomers;

	    @FindBy(css = "a[href='/Admin/Setting/Order']")
	    @CacheLookup
	    private WebElement orderSettings;

	    @FindBy(css = "a[href='/Admin/Order/List']")
	    @CacheLookup
	    private WebElement orders;

	    private final String pageLoadedText = "Saturday, January 23, 2021 1:04 AM";

	    private final String pageUrl = "/Admin/Customer/Create";

	    @FindBy(id = "Password")
	    @CacheLookup
	    private WebElement password;

	    @FindBy(css = "a[href='/Admin/Payment/Methods']")
	    @CacheLookup
	    private WebElement paymentMethods;

	    @FindBy(css = "a[href='/Admin/Payment/MethodRestrictions']")
	    @CacheLookup
	    private WebElement paymentRestrictions;

	    @FindBy(css = "a[href='/Admin/Shipping/PickupPointProviders']")
	    @CacheLookup
	    private WebElement pickupPoints;

	    @FindBy(css = "a[href='/Admin/Poll/List']")
	    @CacheLookup
	    private WebElement polls;

	    @FindBy(css = "a[href='https://www.nopcommerce.com/nopcommerce-premium-support-services?utm_source=admin-panel&utm_medium=menu&utm_campaign=admin-panel']")
	    @CacheLookup
	    private WebElement premiumSupportServices;

	    @FindBy(css = "a[href='/Admin/ProductAttribute/List']")
	    @CacheLookup
	    private WebElement productAttributes;

	    @FindBy(css = "a[href='/Admin/ProductReview/List']")
	    @CacheLookup
	    private WebElement productReviews;

	    @FindBy(css = "a[href='/Admin/Product/ProductTags']")
	    @CacheLookup
	    private WebElement productTags;

	    @FindBy(css = "a[href='/Admin/Product/List']")
	    @CacheLookup
	    private WebElement products;

	    @FindBy(css = "a[href='/Admin/Report/NeverSold']")
	    @CacheLookup
	    private WebElement productsNeverPurchased;

	    @FindBy(css = ".skin-blue.sidebar-mini div:nth-of-type(3) div:nth-of-type(2) div.sidebar ul.sidebar-menu.tree li:nth-of-type(5) a")
	    @CacheLookup
	    private WebElement promotions;

	    @FindBy(css = "a[href='/Admin/RecurringPayment/List']")
	    @CacheLookup
	    private WebElement recurringPayments;

	    @FindBy(css = "a[href='/Admin/Report/RegisteredCustomers']")
	    @CacheLookup
	    private WebElement registeredCustomers;

	    @FindBy(css = ".skin-blue.sidebar-mini div:nth-of-type(3) div:nth-of-type(2) div.sidebar ul.sidebar-menu.tree li:nth-of-type(9) a")
	    @CacheLookup
	    private WebElement reports;

	    @FindBy(css = "a[href='/Admin/ReturnRequest/List']")
	    @CacheLookup
	    private WebElement returnRequests;

	    @FindBy(css = "a[href='/Admin/Setting/RewardPoints']")
	    @CacheLookup
	    private WebElement rewardPoints;

	    @FindBy(css = ".skin-blue.sidebar-mini div:nth-of-type(3) div:nth-of-type(2) div.sidebar ul.sidebar-menu.tree li:nth-of-type(3) a")
	    @CacheLookup
	    private WebElement sales;

	    @FindBy(name = "save")
	    @CacheLookup
	    private WebElement save;

	    @FindBy(name = "save-continue")
	    @CacheLookup
	    private WebElement saveAndContinueEdit;

	    @FindBy(css = "a[href='/Admin/ScheduleTask/List']")
	    @CacheLookup
	    private WebElement scheduleTasks;

	    @FindBy(css = "a[href='/Admin/Common/SeNames']")
	    @CacheLookup
	    private WebElement searchEngineFriendlyPageNames;

	    @FindBy(css = ".skin-blue.sidebar-mini div:nth-of-type(3) div:nth-of-type(2) div.sidebar ul.sidebar-menu.tree li:nth-of-type(7) ul.treeview-menu li:nth-of-type(1) a")
	    @CacheLookup
	    private WebElement settings;

	    @FindBy(css = "a[href='/Admin/Order/ShipmentList']")
	    @CacheLookup
	    private WebElement shipments;

	    @FindBy(css = ".skin-blue.sidebar-mini div:nth-of-type(3) div:nth-of-type(2) div.sidebar ul.sidebar-menu.tree li:nth-of-type(7) ul.treeview-menu li:nth-of-type(11) a")
	    @CacheLookup
	    private WebElement shipping;

	    @FindBy(css = "a[href='/Admin/Shipping/Providers']")
	    @CacheLookup
	    private WebElement shippingProviders;

	    @FindBy(css = "a[href='/Admin/Setting/Shipping']")
	    @CacheLookup
	    private WebElement shippingSettings;

	    @FindBy(css = "a[href='/Admin/Setting/ShoppingCart']")
	    @CacheLookup
	    private WebElement shoppingCartSettings;

	    @FindBy(css = "a[href='/Admin/ShoppingCart/CurrentCarts']")
	    @CacheLookup
	    private WebElement shoppingCartsAndWishlists;

	    @FindBy(css = "a[href='/Admin/SpecificationAttribute/List']")
	    @CacheLookup
	    private WebElement specificationAttributes;

	    @FindBy(css = "a[href='/Admin/Store/List']")
	    @CacheLookup
	    private WebElement stores;

	    @FindBy(css = ".skin-blue.sidebar-mini div:nth-of-type(3) div:nth-of-type(2) div.sidebar ul.sidebar-menu.tree li:nth-of-type(8) a")
	    @CacheLookup
	    private WebElement system;

	    @FindBy(css = "a[href='/Admin/Common/SystemInfo']")
	    @CacheLookup
	    private WebElement systemInformation;

	    @FindBy(css = "a[href='/Admin/Tax/Categories']")
	    @CacheLookup
	    private WebElement taxCategories;

	    @FindBy(css = "a[href='/Admin/Tax/Providers']")
	    @CacheLookup
	    private WebElement taxProviders;

	    @FindBy(css = "a[href='/Admin/Setting/Tax']")
	    @CacheLookup
	    private WebElement taxSettings;

	    @FindBy(css = "a[href='/Admin/Template/List']")
	    @CacheLookup
	    private WebElement templates;

	    @FindBy(css = "a[href='/Admin/Topic/List']")
	    @CacheLookup
	    private WebElement topicsPages;

	    @FindBy(css = "a[href='/Admin/Setting/Vendor']")
	    @CacheLookup
	    private WebElement vendorSettings;

	    @FindBy(css = "a[href='/Admin/Vendor/List']")
	    @CacheLookup
	    private WebElement vendors;

	    @FindBy(css = "a[href='/Admin/Shipping/Warehouses']")
	    @CacheLookup
	    private WebElement warehouses;

	    @FindBy(css = "a[href='/Admin/Common/Warnings']")
	    @CacheLookup
	    private WebElement warnings;

	    @FindBy(css = "a[href='/Admin/Widget/List']")
	    @CacheLookup
	    private WebElement widgets;

	    public AddNewCustomer() {
	    }

	    public AddNewCustomer(WebDriver driver) {
	        this();
	        this.driver = driver;
	    }

	    public AddNewCustomer(WebDriver driver, Map<String, String> data) {
	        this(driver);
	        this.data = data;
	    }

	    public AddNewCustomer(WebDriver driver, Map<String, String> data, int timeout) {
	        this(driver, data);
	        this.timeout = timeout;
	    }

	    /**
	     * Click on Access Control List Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickAccessControlListLink() {
	        accessControlList.click();
	        return this;
	    }

	    /**
	     * Click on Activity Log Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickActivityLogLink() {
	        activityLog.click();
	        return this;
	    }

	    /**
	     * Click on Activity Types Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickActivityTypesLink() {
	        activityTypes.click();
	        return this;
	    }

	    /**
	     * Click on Affiliates Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickAffiliatesLink() {
	        affiliates.click();
	        return this;
	    }

	    /**
	     * Click on All Plugins And Themes Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickAllPluginsAndThemesLink() {
	        allPluginsAndThemes.click();
	        return this;
	    }

	    /**
	     * Click on All Settings Advanced Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickAllSettingsAdvancedLink() {
	        allSettingsAdvanced.click();
	        return this;
	    }

	    /**
	     * Click on Attributes Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickAttributesLink() {
	        attributes.click();
	        return this;
	    }

	    /**
	     * Click on Back To Customer List Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickBackToCustomerListLink() {
	        backToCustomerList.click();
	        return this;
	    }

	    /**
	     * Click on Bestsellers Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickBestsellersLink() {
	        bestsellers.click();
	        return this;
	    }

	    /**
	     * Click on Blog Comments Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickBlogCommentsLink() {
	        blogComments.click();
	        return this;
	    }

	    /**
	     * Click on Blog Posts Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickBlogPostsLink() {
	        blogPosts.click();
	        return this;
	    }

	    /**
	     * Click on Blog Settings Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickBlogSettingsLink() {
	        blogSettings.click();
	        return this;
	    }

	    /**
	     * Click on Campaigns Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickCampaignsLink() {
	        campaigns.click();
	        return this;
	    }

	    /**
	     * Click on Catalog Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickCatalogLink() {
	        catalog.click();
	        return this;
	    }

	    /**
	     * Click on Catalog Settings Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickCatalogSettingsLink() {
	        catalogSettings.click();
	        return this;
	    }

	    /**
	     * Click on Categories Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickCategoriesLink() {
	        categories.click();
	        return this;
	    }

	    /**
	     * Click on Checkout Attributes Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickCheckoutAttributesLink() {
	        checkoutAttributes.click();
	        return this;
	    }

	    /**
	     * Click on Clear Cache Button.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickClearCacheButton() {
	        clearCache.click();
	        return this;
	    }

	    /**
	     * Click on Community Forums Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickCommunityForumsLink() {
	        communityForums.click();
	        return this;
	    }

	    /**
	     * Click on Configuration Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickConfigurationLink() {
	        configuration.click();
	        return this;
	    }

	    /**
	     * Click on Content Management Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickContentManagementLink() {
	        contentManagement.click();
	        return this;
	    }

	    /**
	     * Click on Countries Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickCountriesLink() {
	        countries.click();
	        return this;
	    }

	    /**
	     * Click on Country Sales Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickCountrySalesLink() {
	        countrySales.click();
	        return this;
	    }

	    /**
	     * Click on Currencies Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickCurrenciesLink() {
	        currencies.click();
	        return this;
	    }

	    /**
	     * Click on Customer Reports Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickCustomerReportsLink() {
	        customerReports.click();
	        return this;
	    }

	    /**
	     * Click on Customer Settings Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickCustomerSettingsLink() {
	        customerSettings.click();
	        return this;
	    }

	    /**
	     * Click on Customers Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickCustomers1Link() {
	        customers1.click();
	        return this;
	    }

	    /**
	     * Click on Customers Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickCustomers2Link() {
	        customers2.click();
	        return this;
	    }

	    /**
	     * Click on Customers By Number Of Orders Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickCustomersByNumberOfOrdersLink() {
	        customersByNumberOfOrders.click();
	        return this;
	    }

	    /**
	     * Click on Customers By Order Total Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickCustomersByOrderTotalLink() {
	        customersByOrderTotal.click();
	        return this;
	    }

	    /**
	     * Click on Dashboard Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickDashboardLink() {
	        dashboard.click();
	        return this;
	    }

	    /**
	     * Click on Dates And Ranges Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickDatesAndRangesLink() {
	        datesAndRanges.click();
	        return this;
	    }

	    /**
	     * Click on Discounts Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickDiscountsLink() {
	        discounts.click();
	        return this;
	    }

	    /**
	     * Click on Email Accounts Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickEmailAccountsLink() {
	        emailAccounts.click();
	        return this;
	    }

	    /**
	     * Click on External Authentication Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickExternalAuthenticationLink() {
	        externalAuthentication.click();
	        return this;
	    }

	    /**
	     * Click on Forum Settings Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickForumSettingsLink() {
	        forumSettings.click();
	        return this;
	    }

	    /**
	     * Click on Forums Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickForumsLink() {
	        forums.click();
	        return this;
	    }

	    /**
	     * Click on Gdpr Requests Log Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickGdprRequestsLogLink() {
	        gdprRequestsLog.click();
	        return this;
	    }

	    /**
	     * Click on Gdpr Settings Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickGdprSettingsLink() {
	        gdprSettings.click();
	        return this;
	    }

	    /**
	     * Click on General Settings Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickGeneralSettingsLink() {
	        generalSettings.click();
	        return this;
	    }

	    /**
	     * Click on Gift Cards Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickGiftCardsLink() {
	        giftCards.click();
	        return this;
	    }

	    /**
	     * Click on Help Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickHelpLink() {
	        help.click();
	        return this;
	    }

	    /**
	     * Click on Help Topics Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickHelpTopicsLink() {
	        helpTopics.click();
	        return this;
	    }

	    /**
	     * Click on Languages Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickLanguagesLink() {
	        languages.click();
	        return this;
	    }

	    /**
	     * Click on Local Plugins Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickLocalPluginsLink() {
	        localPlugins.click();
	        return this;
	    }

	    /**
	     * Click on Log Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickLogLink() {
	        log.click();
	        return this;
	    }

	    /**
	     * Click on Logout Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickLogoutLink() {
	        logout.click();
	        return this;
	    }

	    /**
	     * Click on Low Stock Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickLowStockLink() {
	        lowStock.click();
	        return this;
	    }

	    /**
	     * Click on Maintenance Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickMaintenanceLink() {
	        maintenance.click();
	        return this;
	    }

	    /**
	     * Click on Manufacturers Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickManufacturersLink() {
	        manufacturers.click();
	        return this;
	    }

	    /**
	     * Click on Measures Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickMeasuresLink() {
	        measures.click();
	        return this;
	    }

	    /**
	     * Click on Media Settings Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickMediaSettingsLink() {
	        mediaSettings.click();
	        return this;
	    }

	    /**
	     * Click on Message Queue Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickMessageQueueLink() {
	        messageQueue.click();
	        return this;
	    }

	    /**
	     * Click on Message Templates Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickMessageTemplatesLink() {
	        messageTemplates.click();
	        return this;
	    }

	    /**
	     * Click on News Comments Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickNewsCommentsLink() {
	        newsComments.click();
	        return this;
	    }

	    /**
	     * Click on News Items Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickNewsItemsLink() {
	        newsItems.click();
	        return this;
	    }

	    /**
	     * Click on News Settings Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickNewsSettingsLink() {
	        newsSettings.click();
	        return this;
	    }

	    /**
	     * Click on Newsletter Subscribers Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickNewsletterSubscribersLink() {
	        newsletterSubscribers.click();
	        return this;
	    }

	    /**
	     * Click on Nopcommerce Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickNopcommerceLink() {
	        nopcommerce.click();
	        return this;
	    }

	    /**
	     * Click on Online Customers Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickOnlineCustomersLink() {
	        onlineCustomers.click();
	        return this;
	    }

	    /**
	     * Click on Order Settings Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickOrderSettingsLink() {
	        orderSettings.click();
	        return this;
	    }

	    /**
	     * Click on Orders Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickOrdersLink() {
	        orders.click();
	        return this;
	    }

	    /**
	     * Click on Payment Methods Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickPaymentMethodsLink() {
	        paymentMethods.click();
	        return this;
	    }

	    /**
	     * Click on Payment Restrictions Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickPaymentRestrictionsLink() {
	        paymentRestrictions.click();
	        return this;
	    }

	    /**
	     * Click on Pickup Points Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickPickupPointsLink() {
	        pickupPoints.click();
	        return this;
	    }

	    /**
	     * Click on Polls Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickPollsLink() {
	        polls.click();
	        return this;
	    }

	    /**
	     * Click on Premium Support Services Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickPremiumSupportServicesLink() {
	        premiumSupportServices.click();
	        return this;
	    }

	    /**
	     * Click on Product Attributes Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickProductAttributesLink() {
	        productAttributes.click();
	        return this;
	    }

	    /**
	     * Click on Product Reviews Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickProductReviewsLink() {
	        productReviews.click();
	        return this;
	    }

	    /**
	     * Click on Product Tags Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickProductTagsLink() {
	        productTags.click();
	        return this;
	    }

	    /**
	     * Click on Products Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickProductsLink() {
	        products.click();
	        return this;
	    }

	    /**
	     * Click on Products Never Purchased Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickProductsNeverPurchasedLink() {
	        productsNeverPurchased.click();
	        return this;
	    }

	    /**
	     * Click on Promotions Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickPromotionsLink() {
	        promotions.click();
	        return this;
	    }

	    /**
	     * Click on Recurring Payments Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickRecurringPaymentsLink() {
	        recurringPayments.click();
	        return this;
	    }

	    /**
	     * Click on Registered Customers Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickRegisteredCustomersLink() {
	        registeredCustomers.click();
	        return this;
	    }

	    /**
	     * Click on Reports Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickReportsLink() {
	        reports.click();
	        return this;
	    }

	    /**
	     * Click on Return Requests Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickReturnRequestsLink() {
	        returnRequests.click();
	        return this;
	    }

	    /**
	     * Click on Reward Points Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickRewardPointsLink() {
	        rewardPoints.click();
	        return this;
	    }

	    /**
	     * Click on Sales Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickSalesLink() {
	        sales.click();
	        return this;
	    }

	    /**
	     * Click on Save And Continue Edit Button.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickSaveAndContinueEditButton() {
	        saveAndContinueEdit.click();
	        return this;
	    }

	    /**
	     * Click on Save Button.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickSaveButton() {
	        save.click();
	        return this;
	    }

	    /**
	     * Click on Schedule Tasks Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickScheduleTasksLink() {
	        scheduleTasks.click();
	        return this;
	    }

	    /**
	     * Click on Search Engine Friendly Page Names Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickSearchEngineFriendlyPageNamesLink() {
	        searchEngineFriendlyPageNames.click();
	        return this;
	    }

	    /**
	     * Click on Settings Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickSettingsLink() {
	        settings.click();
	        return this;
	    }

	    /**
	     * Click on Shipments Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickShipmentsLink() {
	        shipments.click();
	        return this;
	    }

	    /**
	     * Click on Shipping Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickShippingLink() {
	        shipping.click();
	        return this;
	    }

	    /**
	     * Click on Shipping Providers Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickShippingProvidersLink() {
	        shippingProviders.click();
	        return this;
	    }

	    /**
	     * Click on Shipping Settings Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickShippingSettingsLink() {
	        shippingSettings.click();
	        return this;
	    }

	    /**
	     * Click on Shopping Cart Settings Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickShoppingCartSettingsLink() {
	        shoppingCartSettings.click();
	        return this;
	    }

	    /**
	     * Click on Shopping Carts And Wishlists Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickShoppingCartsAndWishlistsLink() {
	        shoppingCartsAndWishlists.click();
	        return this;
	    }

	    /**
	     * Click on Specification Attributes Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickSpecificationAttributesLink() {
	        specificationAttributes.click();
	        return this;
	    }

	    /**
	     * Click on Stores Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickStoresLink() {
	        stores.click();
	        return this;
	    }

	    /**
	     * Click on System Information Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickSystemInformationLink() {
	        systemInformation.click();
	        return this;
	    }

	    /**
	     * Click on System Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickSystemLink() {
	        system.click();
	        return this;
	    }

	    /**
	     * Click on Tax Categories Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickTaxCategoriesLink() {
	        taxCategories.click();
	        return this;
	    }

	    /**
	     * Click on Tax Providers Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickTaxProvidersLink() {
	        taxProviders.click();
	        return this;
	    }

	    /**
	     * Click on Tax Settings Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickTaxSettingsLink() {
	        taxSettings.click();
	        return this;
	    }

	    /**
	     * Click on Templates Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickTemplatesLink() {
	        templates.click();
	        return this;
	    }

	    /**
	     * Click on Topics Pages Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickTopicsPagesLink() {
	        topicsPages.click();
	        return this;
	    }

	    /**
	     * Click on Vendor Settings Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickVendorSettingsLink() {
	        vendorSettings.click();
	        return this;
	    }

	    /**
	     * Click on Vendors Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickVendorsLink() {
	        vendors.click();
	        return this;
	    }

	    /**
	     * Click on Warehouses Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickWarehousesLink() {
	        warehouses.click();
	        return this;
	    }

	    /**
	     * Click on Warnings Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickWarningsLink() {
	        warnings.click();
	        return this;
	    }

	    /**
	     * Click on Widgets Link.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer clickWidgetsLink() {
	        widgets.click();
	        return this;
	    }

	    /**
	     * Fill every fields in the page.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer fill() {
	        setAdminComment1TextareaField();
	        setEmailEmailField();
	        setPasswordPasswordField();
	        setFirstNameTextField();
	        setLastNameTextField();
	        setGender1RadioButtonField();
	        setGender2RadioButtonField();
	        setDateOfBirthTextField();
	        setCompanyNameTextField();
	        setIsTaxExemptCheckboxField();
	        setNewsletter1DropDownListField();
	        setNewsletter2DropDownListField();
	        setCustomerRoles2TextField();
	        setCustomerRoles3DropDownListField();
	        setManagerOfVendorDropDownListField();
	        setActiveCheckboxField();
	        setAdminComment2TextareaField();
	        return this;
	    }

	    /**
	     * Fill every fields in the page and submit it to target page.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer fillAndSubmit() {
	        fill();
	        return submit();
	    }

	    /**
	     * Set Active Checkbox field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setActiveCheckboxField() {
	        if (!active.isSelected()) {
	            active.click();
	        }
	        return this;
	    }

	    /**
	     * Set default value to Admin Comment Textarea field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setAdminComment1TextareaField() {
	        return setAdminComment1TextareaField(data.get("ADMIN_COMMENT_1"));
	    }

	    /**
	     * Set value to Admin Comment Textarea field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setAdminComment1TextareaField(String adminComment1Value) {
	        adminComment1.sendKeys(adminComment1Value);
	        return this;
	    }

	    /**
	     * Set default value to Admin Comment Textarea field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setAdminComment2TextareaField() {
	        return setAdminComment2TextareaField(data.get("ADMIN_COMMENT_2"));
	    }

	    /**
	     * Set value to Admin Comment Textarea field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setAdminComment2TextareaField(String adminComment2Value) {
	        adminComment2.sendKeys(adminComment2Value);
	        return this;
	    }

	    /**
	     * Set default value to Company Name Text field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setCompanyNameTextField() {
	        return setCompanyNameTextField(data.get("COMPANY_NAME"));
	    }

	    /**
	     * Set value to Company Name Text field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setCompanyNameTextField(String companyNameValue) {
	        companyName.sendKeys(companyNameValue);
	        return this;
	    }

	    /**
	     * Set default value to Customer Roles Text field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setCustomerRoles1TextField() {
	        return setCustomerRoles1TextField(data.get("CUSTOMER_ROLES_1"));
	    }

	    /**
	     * Set value to Customer Roles Text field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setCustomerRoles1TextField(String customerRoles1Value) {
	        customerRoles1.click();
	        return this;
	    }

	    /**
	     * Set default value to Customer Roles Text field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setCustomerRoles2TextField() {
	        return setCustomerRoles2TextField(data.get("CUSTOMER_ROLES_2"));
	    }

	    /**
	     * Set value to Customer Roles Text field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setCustomerRoles2TextField(String customerRoles2Value) {
	        customerRoles2.sendKeys(customerRoles2Value);
	        return this;
	    }

	    /**
	     * Set default value to Customer Roles Drop Down List field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setCustomerRoles3DropDownListField() {
	        return setCustomerRoles3DropDownListField(data.get("CUSTOMER_ROLES_3"));
	    }

	    /**
	     * Set value to Customer Roles Drop Down List field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setCustomerRoles3DropDownListField(String customerRoles3Value) {
	        new Select(customerRoles3).selectByVisibleText(customerRoles3Value);
	        return this;
	    }

	    /**
	     * Set default value to Date Of Birth Text field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setDateOfBirthTextField() {
	        return setDateOfBirthTextField(data.get("DATE_OF_BIRTH"));
	    }

	    /**
	     * Set value to Date Of Birth Text field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setDateOfBirthTextField(String dateOfBirthValue) {
	        dateOfBirth.sendKeys(dateOfBirthValue);
	        return this;
	    }

	    /**
	     * Set default value to Email Email field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setEmailEmailField() {
	        return setEmailEmailField(data.get("EMAIL"));
	    }

	    /**
	     * Set value to Email Email field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setEmailEmailField(String emailValue) {
	        email.sendKeys(emailValue);
	        return this;
	    }

	    /**
	     * Set default value to First Name Text field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setFirstNameTextField() {
	        return setFirstNameTextField(data.get("FIRST_NAME"));
	    }

	    /**
	     * Set value to First Name Text field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setFirstNameTextField(String firstNameValue) {
	        firstName.sendKeys(firstNameValue);
	        return this;
	    }

	    /**
	     * Set default value to Gender Radio Button field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setGender1RadioButtonField() {
	        for (WebElement el : gender1) {
	            if (el.getAttribute("value").equals(gender1Value)) {
	                if (!el.isSelected()) {
	                    el.click();
	                }
	                break;
	            }
	        }
	        return this;
	    }

	    /**
	     * Set default value to Gender Radio Button field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setGender2RadioButtonField() {
	        for (WebElement el : gender2) {
	            if (el.getAttribute("value").equals(gender2Value)) {
	                if (!el.isSelected()) {
	                    el.click();
	                }
	                break;
	            }
	        }
	        return this;
	    }

	    /**
	     * Set Is Tax Exempt Checkbox field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setIsTaxExemptCheckboxField() {
	        if (!isTaxExempt.isSelected()) {
	            isTaxExempt.click();
	        }
	        return this;
	    }

	    /**
	     * Set default value to Last Name Text field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setLastNameTextField() {
	        return setLastNameTextField(data.get("LAST_NAME"));
	    }

	    /**
	     * Set value to Last Name Text field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setLastNameTextField(String lastNameValue) {
	        lastName.sendKeys(lastNameValue);
	        return this;
	    }

	    /**
	     * Set default value to Manager Of Vendor Drop Down List field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setManagerOfVendorDropDownListField() {
	        return setManagerOfVendorDropDownListField(data.get("MANAGER_OF_VENDOR"));
	    }

	    /**
	     * Set value to Manager Of Vendor Drop Down List field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setManagerOfVendorDropDownListField(String managerOfVendorValue) {
	        new Select(managerOfVendor).selectByVisibleText(managerOfVendorValue);
	        return this;
	    }

	    /**
	     * Set default value to Newsletter Drop Down List field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setNewsletter1DropDownListField() {
	        return setNewsletter1DropDownListField(data.get("NEWSLETTER_1"));
	    }

	    /**
	     * Set value to Newsletter Drop Down List field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setNewsletter1DropDownListField(String newsletter1Value) {
	        newsletter1.sendKeys(newsletter1Value);
	        return this;
	    }

	    /**
	     * Set default value to Newsletter Drop Down List field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setNewsletter2DropDownListField() {
	        return setNewsletter2DropDownListField(data.get("NEWSLETTER_2"));
	    }

	    /**
	     * Set value to Newsletter Drop Down List field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setNewsletter2DropDownListField(String newsletter2Value) {
	        new Select(newsletter2).selectByVisibleText(newsletter2Value);
	        return this;
	    }

	    /**
	     * Set default value to Password Password field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setPasswordPasswordField() {
	        return setPasswordPasswordField(data.get("PASSWORD"));
	    }

	    /**
	     * Set value to Password Password field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer setPasswordPasswordField(String passwordValue) {
	        password.sendKeys(passwordValue);
	        return this;
	    }

	    /**
	     * Submit the form to target page.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer submit() {
	        clickClearCacheButton();
	        return this;
	    }

	    /**
	     * Unset Active Checkbox field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer unsetActiveCheckboxField() {
	        if (active.isSelected()) {
	            active.click();
	        }
	        return this;
	    }

	    /**
	     * Unset default value from Customer Roles Drop Down List field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer unsetCustomerRoles3DropDownListField() {
	        return unsetCustomerRoles3DropDownListField(data.get("CUSTOMER_ROLES_3"));
	    }

	    /**
	     * Unset value from Customer Roles Drop Down List field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer unsetCustomerRoles3DropDownListField(String customerRoles3Value) {
	        new Select(customerRoles3).deselectByVisibleText(customerRoles3Value);
	        return this;
	    }

	    /**
	     * Unset Is Tax Exempt Checkbox field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer unsetIsTaxExemptCheckboxField() {
	        if (isTaxExempt.isSelected()) {
	            isTaxExempt.click();
	        }
	        return this;
	    }

	    /**
	     * Unset default value from Manager Of Vendor Drop Down List field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer unsetManagerOfVendorDropDownListField() {
	        return unsetManagerOfVendorDropDownListField(data.get("MANAGER_OF_VENDOR"));
	    }

	    /**
	     * Unset value from Manager Of Vendor Drop Down List field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer unsetManagerOfVendorDropDownListField(String managerOfVendorValue) {
	        new Select(managerOfVendor).deselectByVisibleText(managerOfVendorValue);
	        return this;
	    }

	    /**
	     * Unset default value from Newsletter Drop Down List field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer unsetNewsletter2DropDownListField() {
	        return unsetNewsletter2DropDownListField(data.get("NEWSLETTER_2"));
	    }

	    /**
	     * Unset value from Newsletter Drop Down List field.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer unsetNewsletter2DropDownListField(String newsletter2Value) {
	        new Select(newsletter2).deselectByVisibleText(newsletter2Value);
	        return this;
	    }

	    /**
	     * Verify that the page loaded completely.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer verifyPageLoaded() {
	        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
	            public Boolean apply(WebDriver d) {
	                return d.getPageSource().contains(pageLoadedText);
	            }
	        });
	        return this;
	    }

	    /**
	     * Verify that current page URL matches the expected URL.
	     *
	     * @return the AddNewCustomer class instance.
	     */
	    public AddNewCustomer verifyPageUrl() {
	        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
	            public Boolean apply(WebDriver d) {
	                return d.getCurrentUrl().contains(pageUrl);
	            }
	        });
	        return this;
	    }
	}

}

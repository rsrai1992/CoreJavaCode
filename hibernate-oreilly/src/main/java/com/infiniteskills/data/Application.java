package com.infiniteskills.data;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import com.infiniteskills.data.entities.TransactionData;

public class Application {
	
	@SuppressWarnings({ "rawtypes", "deprecation", "null" })
	public static void main(String[] args) {
		
		// Strat Hibernate Implementation
		// for user entity class
		/*
		//BasicConfigurator.configure();
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
		session.getTransaction().begin();
		User user = new User();
		user.setBirthdate(getMyBirthday());
		user.setCreatedBy("Kewin");
		user.setCreatedDate(new Date());
		user.setEmailAddress("rsrai@novopay.in");
		user.setFirstName("Kewin");
		user.setLastName("Bowsrx");
		user.setLastUpdatedBy("kewin");
		user.setLastUpdatedDate(new Date());
		session.save(user);
		session.getTransaction().commit();
		
		session.refresh(user);
		System.out.println(user.getAge());
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		session.beginTransaction();
		User dbUser = session.get(User.class, user.getUserId());
		dbUser.setFirstName("Joel");
		session.update(dbUser);
		session.getTransaction().commit();
		session.close();
		
		
		// for TimeTest entity class
		try {
		session.getTransaction().begin();
		TimeTest test = new TimeTest(new Date());
		session.save(test);
		session.getTransaction().commit();
		session.refresh(test);
		System.out.println(test.toString());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			HibernateUtil.getSessionFactory().close();
		}
		*/
		// fot bank entity class
		/*
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
		Transaction transaction = session.beginTransaction();
		
		Bank bank = new Bank();
		bank.setName("Federal Trust");
		bank.setAddressLine1("33 wall street");
		bank.setAddressLine2("Suite 302");
		bank.setCity("New York");
		bank.setState("NY");
		bank.setZipCode("560068");
		bank.setCreatedBy("Kewin Bowrsax");
		bank.setCreatedDate(new Date());
		bank.setLastUpdatedBy("Kewin Bowrsax");
		bank.setLastUpdatedDate(new Date());
		bank.setInternational(false);
		bank.getContacts().put("MANAGER", "Joe");
		bank.getContacts().put("TELLER","Marry");
		
		session.save(bank);
		transaction.commit();
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		*/
//
//	private static Date getMyBirthday() {
//		Calendar calender = Calendar.getInstance();
//		calender.set(Calendar.YEAR, 1984);
//		calender.set(Calendar.MONTH, 6);
//		calender.set(Calendar.DATE, 19);
//		return calender.getTime();
//	

		// new user and address entity
		/*
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
		Transaction transaction = session.beginTransaction();
		
		User user = new User();
		Address address = new Address();
		user.setAge(22);
		user.setBirthdate(new Date());
		user.setCreatedBy("kevin");
		user.setCreatedDate(new Date());
		user.setEmailAddress("rssrai@gmail.com");
		user.setFirstName("Kevin");
		user.setLastName("Bowrsox");
		user.setLastUpdatedBy("kmb");
		user.setLastUpdatedDate(new Date());
		
		address.setAddressLine1("addressLine1");
		address.setAddressLine2("addressLine2");
		address.setCity("Philadelphia");
		address.setState("LA");
		address.setZipCode("560035");
		
		user.setAddress(address);
		
		session.save(user);
		transaction.commit();
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		// for composite Address entity
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
		Transaction transaction = session.beginTransaction();
		
		User user = new User();
		
		Address address = new Address();
		Address address2 = new Address();
		setAddressFields(address);
		setAddressFields2(address2);
		user.getAddress().add(address);
		user.getAddress().add(address2);
		setUserFields(user);
		
		session.save(user);
		transaction.commit();
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			HibernateUtil.getSessionFactory().close();
		}
	}

	private static void setUserFields(User user) {
		user.setAge(22);
		user.setBirthdate(new Date());
		user.setCreatedBy("Ravi");
		user.setCreatedDate(new Date());
		user.setEmailAddress("rsrai@novopay.in");
		user.setFirstName("Kevin");
		user.setLastName("Bowrsox");
		user.setLastUpdatedBy("kevin");
		user.setLastUpdatedDate(new Date());
		
	}

	private static void setAddressFields2(Address address2) {
		address2.setAddressLine1("addressLine3");
		address2.setAddressLine2("addressLine4");
		address2.setCity("California");
		address2.setState("NY");
		address2.setZipCode("223332");
		
	}

	private static void setAddressFields(Address address) {
		address.setAddressLine1("addressLine1");
		address.setAddressLine2("addressLine2");
		address.setCity("Redwood");
		address.setState("NY");
		address.setZipCode("223332");
		
	} 
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
		Transaction transaction = session.beginTransaction();
		
		User user = new User();
		user.setFirstName("Kevin");
		user.setLastName("Bowrsox");
		user.setAge(22);
		user.setBirthdate(new Date());
		user.setCreatedBy("kevin");
		user.setCreatedDate(new Date());
		user.setEmailAddress("rssrai@gmail.com");
		user.setLastUpdatedBy("kmb");
		user.setLastUpdatedDate(new Date());
		
		Credential credential = new  Credential();
		credential.setPassword("kewinPassword");
		credential.setUserName("kewin007");
		
		credential.setUser(user);
		user.setCredential(credential);
		
		session.save(credential);
		transaction.commit();
		
		User dbUser=session.get(User.class, credential.getUser().getUserId());
		System.out.println("Selected user from credential entity - "+dbUser.getFirstName());
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
		Transaction transaction = session.beginTransaction();
		
		//Account account = createNewAccount();
		Account account = new Account();
		
		Budget budget = new Budget();
		budget.setMaxAmount(new BigDecimal("10000.00"));
		budget.setName("Emergency Fund");
		budget.setPeriod("Yearly");
		
		budget.getTransaction().add(createNewBeltPurchase(account));
		budget.getTransaction().add(createShoePurchase(account));
		
		session.save(budget);
		transaction.commit();
		
		//account.getTransaction().add(createNewBeltPurchase(account));
		//account.getTransaction().add(createShoePurchase(account));
		
		
		//session.save(account);
		//transaction.commit();
		//TransactionData dbTransaction = (TransactionData)session.get(TransactionData.class, account.getTransaction().get(0).getTransactionId());
		//System.out.println(dbTransaction.getAmount());
		}
		catch (Exception e) {
			e.printStackTrace();
			HibernateUtil.getSessionFactory().close();
		}
		
	}

	private static TransactionData createShoePurchase(Account account) {
		TransactionData shoePurchase = new TransactionData();
		shoePurchase.setAccount(account);
		shoePurchase.setAmount(200.00);
		shoePurchase.setClosingBalance(0.00);
		shoePurchase.setCreatedBy("kewin");
		shoePurchase.setCreatedDate(new Date());
		shoePurchase.setInitialBalance(0.00);
		shoePurchase.setLastUpdatedBy("Ravi");
		shoePurchase.setLastUpdatedDate(new Date());
		shoePurchase.setNotes("New Pair of shoes");
		shoePurchase.setTransactionType("debit");
		return shoePurchase;
	}

	private static TransactionData createNewBeltPurchase(Account account) {
		TransactionData beltPurchase = new TransactionData();
		beltPurchase.setAccount(account);
		beltPurchase.setAmount(50.00);
		beltPurchase.setClosingBalance(0.00);
		beltPurchase.setCreatedBy("kewin Bowersox");
		beltPurchase.setCreatedDate(new Date());
		beltPurchase.setInitialBalance(0.00);
		beltPurchase.setLastUpdatedBy("Ravi");
		beltPurchase.setLastUpdatedDate(new Date());
		beltPurchase.setNotes("New Belt Dress");
		beltPurchase.setTransactionType("debit");
		return beltPurchase;
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
		Transaction transaction = session.beginTransaction();
		
		Account account = new Account();
		Account account2 = new Account();
		User user = createUser();
		User user2 = createUser();
		
		account.getUsers().add(user);
		account.getUsers().add(user2);
		user.getAccount().add(account);
		user2.getAccount().add(account);
		
		account2.getUsers().add(user);
		account2.getUsers().add(user2);
		user.getAccount().add(account2);
		user2.getAccount().add(account2);
		
		session.save(user);
		session.save(user2);
		transaction.commit();
		
		User dbuser = session.get(User.class, user.getUserId());
		System.out.println(dbuser.getAccount().iterator().next().getName());
		
//		Account dbaccount = (Account) session.get(Account.class,account.getAccountId());
//		System.out.println(dbaccount.getUsers().iterator().next().getEmailAddress());
		
		//account.getTransaction().add(createNewBeltPurchase(account));
		//account.getTransaction().add(createShoePurchase(account));
		
		
		//session.save(account);
		//transaction.commit();
		//TransactionData dbTransaction = (TransactionData)session.get(TransactionData.class, account.getTransaction().get(0).getTransactionId());
		//System.out.println(dbTransaction.getAmount());
		}
		catch (Exception e) {
			e.printStackTrace();
			HibernateUtil.getSessionFactory().close();
		}
	}

	private static User createUser() {
		User user = new User();
		Address address = new Address();
		user.setAddress(Arrays.asList(new Address()));
		user.setBirthdate(new Date());
		user.setCreatedBy("Ravi");
		user.setBirthdate(new Date());
		user.setCredential(createCredential(user));
		user.setEmailAddress("abcd@novopay.in");
		user.setFirstName("John");
		user.setLastName("Doe");
		user.setLastUpdatedBy("System");
		user.setLastUpdatedDate(new Date());
		return user;
	}

	private static Credential createCredential(User user) {
		Credential credential = new Credential();
		credential.setUser(user);
		credential.setUserName("test_user");
		credential.setPassword("test");
		return credential;
		}
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Account account = createNewAccount();
		TransactionData trans1 = createNewBeltPurchase(account);
		TransactionData trans2 = createShoePurchase(account);
		account.getTransaction().add(trans1);
		account.getTransaction().add(trans2);
		
		System.out.println(session.contains(account));
		System.out.println(session.contains(trans1));
		System.out.println(session.contains(trans2));
		
		try {
		Transaction transaction = session.beginTransaction();
		session.save(account);
		
		System.out.println(session.contains(account));
		System.out.println(session.contains(trans1));
		System.out.println(session.contains(trans2)); 
		
		transaction.commit();
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			HibernateUtil.getSessionFactory().close();
		}
	}

	private static Account createNewAccount() {
		Account account = new Account();
		account.setCloseDate(new Date());
		account.setOpenDate(new Date());
		account.setCreatedBy("Ravi Rai");
		account.setInitialBalance(50.00);
		account.setName("Saving Account");
		account.setCurrentBalance(100.00);
		account.setLastUpdatedBy("Kewin Bowrsox");
		account.setLastUpdatedDate(new Date());
		account.setCreatedDate(new Date());
		return account;
	}
	private static TransactionData createShoePurchase(Account account) {
		TransactionData shoePurchase = new TransactionData();
		shoePurchase.setAccount(account);
		shoePurchase.setAmount(200.00);
		shoePurchase.setClosingBalance(0.00);
		shoePurchase.setCreatedBy("kewin");
		shoePurchase.setCreatedDate(new Date());
		shoePurchase.setInitialBalance(0.00);
		shoePurchase.setLastUpdatedBy("Ravi");
		shoePurchase.setLastUpdatedDate(new Date());
		shoePurchase.setNotes("New Pair of shoes");
		shoePurchase.setTransactionType("debit");
		return shoePurchase;
	}

	private static TransactionData createNewBeltPurchase(Account account) {
		TransactionData beltPurchase = new TransactionData();
		beltPurchase.setAccount(account);
		beltPurchase.setAmount(50.00);
		beltPurchase.setClosingBalance(0.00);
		beltPurchase.setCreatedBy("kewin Bowersox");
		beltPurchase.setCreatedDate(new Date());
		beltPurchase.setInitialBalance(0.00);
		beltPurchase.setLastUpdatedBy("Ravi");
		beltPurchase.setLastUpdatedDate(new Date());
		beltPurchase.setNotes("New Belt Dress");
		beltPurchase.setTransactionType("debit");
		return beltPurchase;
	} 
      Session session = HibernateUtil.getSessionFactory().openSession();
      
		try {
		Transaction transaction = session.beginTransaction();
		/*
		Bank bank = session.get(Bank.class, 14L);
		Bank bank = session.load(Bank.class, 141L);
		System.out.println("Method executed.");
		System.out.println(bank.getName());
		
		Bank bank = session.get(Bank.class, 14L);
		bank.setName("New IDFC Bank");
		bank.setLastUpdatedBy("Novopay");
		bank.setLastUpdatedDate(new Date());
		transaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			HibernateUtil.getSessionFactory().close();
		}
			      
		try {
	    Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Bank bank = session.get(Bank.class, 15L);
		transaction.commit();
		session.close();
		
		Session session2 = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction2 = session2.beginTransaction();
		System.out.println(session2.contains(bank));
		session2.update(bank);
		bank.setName("IDFC First");
		System.out.println("Method invkoed");
		System.out.println(session2.contains(bank));
		transaction2.commit();
		session2.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			HibernateUtil.getSessionFactory().close();
		} 
		
		try {
		    Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			Bank detachedBank = session.get(Bank.class, 15L);
			transaction.commit();
			session.close();
			
			//transient object created new
			Bank transientBank = createBank();
			
			Session session2 = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction2 = session2.beginTransaction();
			
			session2.saveOrUpdate(transientBank);
			session2.saveOrUpdate(detachedBank);
			
			detachedBank.setName("HSBC Bank");
			
			transaction2.commit();
			session2.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				HibernateUtil.getSessionFactory().close();
			}
	}

	private static Bank createBank() {
		Bank bank = new Bank();
		bank.setName("Dutch Bank");
		bank.setAddressLine1("23 Washington plaza");
		bank.setAddressLine2("Building No - 007");
		bank.setCity("Washington");
		bank.setCreatedBy("Ravi Rai");
		bank.setCreatedDate(new Date());
		bank.setInternational(false);
		bank.setLastUpdatedBy("Kewin");
		bank.setLastUpdatedDate(new Date());
		bank.setState("NZ");
		bank.setZipCode("12432");
		return bank;
	}  
	Hibernet implememtation ended 
		
		// *** Start JPA implememtation
		//example -1
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_ifinances");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		 
		Bank bank = createBank();
		em.persist(bank);
		tx.commit();
		em.close();
		emf.close();  
	}
		
		//Start example-2
		/*
		EntityManagerFactory factory = null;
		EntityManager em = null;
		EntityTransaction tx =  null;
		try {
			factory = Persistence.createEntityManagerFactory("JPA_ifinances");
			em = factory.createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			Bank bank = createBank();
			em.persist(bank);
			tx.commit();
			
		}catch(Exception e) {
			tx.rollback();
		}
		finally {
			em.close();
			factory.close();
		}
	} 
	// for creating bank object
		private static Bank createBank() {
			Bank bank = new Bank();
			bank.setName("Goldmen Sachs");
			bank.setAddressLine1("23 Washington plaza");
			bank.setAddressLine2("Building No - 007");
			bank.setCity("Washington");
			bank.setCreatedBy("Ravi Rai");
			bank.setCreatedDate(new Date());
			bank.setInternational(false);
			bank.setLastUpdatedBy("Kewin");
			bank.setLastUpdatedDate(new Date());
			bank.setState("NZ");
			bank.setZipCode("12432");
			return bank;
		}  
		// example for implementing compound primary key.
		SessionFactory sessionFactory = null;
		Session session = null;
		Session session2 = null;
		Transaction tx = null;
		Transaction tx2 = null;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Currency currency = new Currency();
			currency.setCountryName("United States");
			currency.setName("Dollar");
			currency.setSymbol("$");
			session.persist(currency);
			tx.commit();
			
			session2 = sessionFactory.openSession();
			tx2 = session2.beginTransaction();
			
			Currency dbCurrency = (Currency)session2.get(Currency.class, new CurrencyId("Dollar","United States"));
			System.out.println(dbCurrency.getName());
			tx2.commit();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
//			finally {
//				sessionFactory.close();
//				session.close();
//				session2.close();
//			} 
		// Example - Compound Join column
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			Currency currency = new Currency();
			currency.setCountryName("UAE");
			currency.setName("DINAR");
			currency.setSymbol("Dinar Sign");
			
			Market market = new Market();
			market.setMarketName("UAE Stock Exchnage");
			market.setCurrency(currency);
			
			session.persist(market);
			tx.commit();
			
			Market dbMarket = session.get(Market.class, market.getMarketId());
			System.out.println(dbMarket.getCurrency().getName());
			
			}
			catch (Exception e) {
				e.printStackTrace();
				tx.rollback();
			}
			finally {
				session.close();
				sessionFactory.close();
			}  
		// Example - enum for account_type
		
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			Account account = createNewAccount();
			account.setAccountType(AccountTypeEnum.CURRENT);
				
			session.save(account);
			tx.commit();
			
			Account dbAccount = session.get(Account.class, account.getAccountId());
			System.out.println(dbAccount.getName());
			System.out.println(dbAccount.getAccountType());
			}
			catch (Exception e) {
				e.printStackTrace();
				tx.rollback();
			}
			finally {
				session.close();
				sessionFactory.close();
			}
	}
	
	private static Account createNewAccount() {
		Account account = new Account();
		account.setCloseDate(new Date());
		account.setOpenDate(new Date());
		account.setCreatedBy("Rohit Sharma");
		account.setInitialBalance(5000.00);
		account.setName("Loan Account");
		account.setCurrentBalance(4000.00);
		account.setLastUpdatedBy("xyz");
		account.setLastUpdatedDate(new Date());
		account.setCreatedDate(new Date());
		return account;
	} 
	//Example for mapped super class
	SessionFactory sessionFactory = null;
	Session session = null;
	Transaction tx = null;
	try {
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		
		Stock stock = createStock();	
		session.save(stock);
		
		Bond bond = createBond();
		session.save(bond);
		tx.commit();
		
		}
		catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		finally {
			session.close();
			sessionFactory.close();
		}
	}

	private static Bond createBond() {
		Bond bond = new Bond();
		bond.setIntrestRate(new BigDecimal("123.23"));
		bond.setIssuer("JP Morgan Chase");
		bond.setMaturityDate(new Date());
		bond.setPurchaseDate(new Date());
		bond.setName("Long term bond purchase");
		bond.setValue(new BigDecimal("10.50"));
		return bond;
	}

	private static Stock createStock() {
		Stock stock = new Stock();
		stock.setIssuer("Morgan Stainly");
		stock.setName("Morgan stock purchase");
		stock.setPurchaseDate(new Date());
		stock.setSharePrice(new BigDecimal("105.56"));
		stock.setQuantity(500);
		return stock;
	}
	*/
		//// Criteria API Example -1 /////
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			Criteria criteria = session.createCriteria(TransactionData.class);
			criteria.addOrder(Order.desc("title"));
			
			List<TransactionData> transaction = null;
			
			for(TransactionData t: transaction) {
				System.out.println(t.getTransactionType());
			}
			
			tx.commit();
			}catch (Exception e) {
				e.printStackTrace();
				tx.rollback();
			}
			finally {
				session.close();
				sessionFactory.close();
			}
		
	}
}

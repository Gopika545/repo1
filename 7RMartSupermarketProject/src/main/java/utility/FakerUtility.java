package utility;

import com.github.javafaker.Faker;

public class FakerUtility {
	Faker faker = new Faker();
	public String createRandomUserName()
	{
		return faker.name().username();
	}
	public String createRandomPassword()
	{
		return faker.internet().password();
		
	}
	public String createRandomfullName()
	{
		return faker.name().firstName();
		
	}
	public String createRandomAddress()
	{
		return faker.address().fullAddress();
	}
	public String createRandomemail()
	{
		return faker.internet().emailAddress();
	}

	

}

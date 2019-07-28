import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		Employee a1 = new Employee(23, "Surjit");
		Employee a2 = new Employee(43, "Tom");
		Employee a3 = new Employee(22, "Vivek");
		Employee a4 = new Employee(15, "Vinit");
		
		HashSet hs = new HashSet<Employee>();
		hs.add(a1);
		hs.add(a2);
		hs.add(a3);
		hs.add(a4);
		
		//System.out.println(hs);
		
		Long l1 = new Long(23);
		Long l2 = 22L;
		//System.out.println(l1+l2);
		//Tunisia, Turkey, Turkmenistan, Turks and Caico, Tuvalu, USA, Uganda, Ukraine, United States Minor Outlying Islands, Uruguay, Uzbekistan, Vanuatu, Vatican, Venezuela, Vietnam, Virgin Islands (Brit.), Virgin Islands (USA), Wallis and Futu, Western Sahara, Yemen, Zambia, Zimbabwe

		String res = "Afghanistan, African Republ., Aland Islands, Albania, Algeria, American Samoa, Andorra, Angola, Anguilla, Antigua & Barbu, Arab Emirates, Argentina, Armenia, Aruba, Austria, Azerbaijan, Bahamas, Bahrain, Bangladesh, Barbados, Belarus, Belau (Palau), Belgium, Belize, Benin, Bermuda, Bhutan, Bolivia, Bosnia-Herzego., Botswana, Bouvet Island, Brazil, Brit Antarctic, Brit Indian Oce, Brunei Darussal, Bulgaria, Burkina Faso, Burundi, Cambodia, Cameroon, Cape Verde, Cayman Islands, Chad, Chile, Colombia, Comoros, Congo Republ., Costa Rica, Croatia, Cuba, Cyprus, Czech Republic, DR Congo (Zaire, Djibouti, Dominica, Ecuador, Egypt, El Salvador, Equat. Guinea, Eritrea, Ethiopia, Falkland Island, Faroe Islands, Fiji, Fr Southern Ter, France, French Guiana, Gabon, Gambia, Georgia, Germany, Ghana, Gibraltar, Great Britain, Greece, Greenland, Grenada, Guadeloupe, Guam, Guatemala, Guinea-Bissau, Guyana, Haiti, Honduras, Hungary, Iran, Iraq, Ireland, Israel, Italy, Ivory Coast, Jamaica, Japan, Jordan, Kazakhstan, Kenya, Kiribati, Kuwait, Kyrgyztan, Laos, Lebanon, Lesotho, Liberia, Libya, Liechtenstein, Luxembourg, Macau, Macedonia, Madagascar, Malawi, Maldives, Mali, Malta, Marshall Island, Martinique, Mauritania, Mauritius, Mayotte, Mexico, Micronesia, Moldova, Monaco, Mongolia, Montenegro, Montserrat, Morocco, Mozambique, Myanmar (Burma), Namibia, Nauru, Nepal, Netherlands, New Caledonia, Nicaragua, Niger, Nigeria, NorthMariana Is, Oman, Pakistan, Palestine, Panama, Papua NewGuinea, Paraguay, Peru, Pitcairn Island, Poland, Polynesia (Fr.), Qatar, Rep. Korea, Reunion, Romania, Russia, Rwanda, Saint Barthelemy, Saint Martin, San Marino, Sao Tome & Prin, Saudi Arabia, Senegal, Serbia, Seychelles, Sierra Leone, Singapore, Sint Maarten (Dutch Part), Slovakia Rep., Slovenia, Solomon Islands, Somalia, South Africa, South Georgia and South Sandwich Islands, South Sudan, Spain, Sri Lanka, St. Helena, St. Kitts&Nevis, St. Lucia, St. Pierre&Miqu, St. Vincent&Gre, Suriname, Svalbard & Jan Mayen Islands, Swaziland, Switzerland, Syria, Taiwan, Tajikistan, Tanzania, Timor-Leste, Togo, Tonga, Trinidad and Tobago, Tunisia, Turkey, Turkmenistan, Turks and Caico, Tuvalu, Uganda, Ukraine, United States Minor Outlying Islands, Uruguay, Uzbekistan, Vanuatu, Vatican, Venezuela, Vietnam, Virgin Islands (Brit.), Virgin Islands (USA), Wallis and Futu, Western Sahara, Yemen, Zambia, Zimbabwe";
		String Result="Mexico, Singapore, Abc";
		
		//System.out.println(Result);
		List<String> items = Stream.of(res.split(", ")).collect(Collectors.toList());
		for(String item : items){
			if(Result.indexOf(item+",") >= 0) {
				Result = Result.replace(item+",", "");
			}else {
				Result = Result.replace(item, "");
			}
		}
		
		//System.out.println(Result);
		
		String res1 = "Afghanistan, African Republ., Aland Islands, Albania, Algeria, American Samoa, Andorra, Angola, Anguilla, Antigua & Barbu, Arab Emirates, Argentina, Armenia, Aruba, Austria, Azerbaijan, Bahamas, Bahrain, Bangladesh, Barbados, Belarus, Belau (Palau), Belgium, Belize, Benin, Bermuda, Bhutan, Bolivia, Bosnia-Herzego., Botswana, Bouvet Island, Brazil, Brit Antarctic, Brit Indian Oce, Brunei Darussal, Bulgaria, Burkina Faso, Burundi, Cambodia, Cameroon, Cape Verde, Cayman Islands, Chad, Chile, Colombia, Comoros, Congo Republ., Costa Rica, Croatia, Cuba, Cyprus, Czech Republic, DR Congo (Zaire, Djibouti, Dominica, Ecuador, Egypt, El Salvador, Equat. Guinea, Eritrea, Ethiopia, Falkland Island, Faroe Islands, Fiji, Fr Southern Ter, France, French Guiana, Gabon, Gambia, Georgia, Germany, Ghana, Gibraltar, Great Britain, Greece, Greenland, Grenada, Guadeloupe, Guam, Guatemala, Guinea-Bissau, Guyana, Haiti, Honduras, Hungary, Iran, Iraq, Ireland, Israel, Italy, Ivory Coast, Jamaica, Japan, Jordan, Kazakhstan, Kenya, Kiribati, Kuwait, Kyrgyztan, Laos, Lebanon, Lesotho, Liberia, Libya, Liechtenstein, Luxembourg, Macau, Macedonia, Madagascar, Malawi, Maldives, Mali, Malta, Marshall Island, Martinique, Mauritania, Mauritius, Mayotte, Mexico, Micronesia, Moldova, Monaco, Mongolia, Montenegro, Montserrat, Morocco, Mozambique, Myanmar (Burma), Namibia, Nauru, Nepal, Netherlands, New Caledonia, Nicaragua, Niger, Nigeria, NorthMariana Is, Oman, Pakistan, Palestine, Panama, Papua NewGuinea, Paraguay, Peru, Pitcairn Island, Poland, Polynesia (Fr.), Qatar, Rep. Korea, Reunion, Romania, Russia, Rwanda, Saint Barthelemy, Saint Martin, San Marino, Sao Tome & Prin, Saudi Arabia, Senegal, Serbia, Seychelles, Sierra Leone, Singapore, Sint Maarten (Dutch Part), Slovakia Rep., Slovenia, Solomon Islands, Somalia, South Africa, South Georgia and South Sandwich Islands, South Sudan, Spain, Sri Lanka, St. Helena, St. Kitts&Nevis, St. Lucia, St. Pierre&Miqu, St. Vincent&Gre, Suriname, Svalbard & Jan Mayen Islands, Swaziland, Switzerland, Syria, Taiwan, Tajikistan, Tanzania, Timor-Leste, Togo, Tonga, Trinidad and Tobago, Tunisia, Turkey, Turkmenistan, Turks and Caico, Tuvalu, Uganda, Ukraine, United States Minor Outlying Islands, Uruguay, Uzbekistan, Vanuatu, Vatican, Venezuela, Vietnam, Virgin Islands (Brit.), Virgin Islands (USA), Wallis and Futu, Western Sahara, Yemen, Zambia, Zimbabwe";
		String Result1="Mexico, Singapore, Abc";
		
		List<String> items1 = Stream.of(res1).collect(Collectors.toList());
		
		Test.replaceTerritory(Result1, items1);
		
		//System.out.println(Test.replaceTerritory(Result1, items1));
	}
	
	private  static String replaceTerritory(String Result, List<String> items) {
		System.out.println(Result);
		for(String item : items){
			if(Result.indexOf(item+",") >= 0) {
				Result = Result.replace(item+",", "");
			}else {
				Result = Result.replace(item, "");
			}
		}
		System.out.println(Result);
		return Result;
	}
}



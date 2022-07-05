package E2ETestc;



public class AdyenCC 
{

	/*
	// 1. Create empty cart
	@SuppressWarnings("deprecation")
	String cartid = helper.createEmptyCart(type);

	// 2. Add sku to cart
	@SuppressWarnings("deprecation")
	String[] lineItemIds = helper.addSKU(cartid, type, skuID, 1);

	// 3. View cart
	Response actualCartResponse = helper.viewCart(cartid, lineItemIds);
	System.out.println(actualCartResponse.toString());

	// Get shipping options- NOT REQUIRED
	String[] applicableShippingMethods = helper.shippingOptions(cartid);
	assertionHelper.assertShippingMethods(applicableShippingMethods,
			new String[] { ShippingMethod.STANDARD.toString(), ShippingMethod.COURIER.toString() });

	Map<String, String> shippingInfoRequestData = new HashMap<String, String>();
	shippingInfoRequestData.put("title", "Mr");
	shippingInfoRequestData.put("first_name", "Bill");
	shippingInfoRequestData.put("last_name", "Mathew");
	shippingInfoRequestData.put("line_1", "BartonHillFarm");
	shippingInfoRequestData.put("line_2", "BartonHillRoad");
	shippingInfoRequestData.put("city", "Luton");
	shippingInfoRequestData.put("state", "Bedfordshire");
	shippingInfoRequestData.put("country", "UK");
	shippingInfoRequestData.put("postal_code", "LU28NF");
	shippingInfoRequestData.put("email", "samsung135test@gmail.com");
	shippingInfoRequestData.put("phone", "07911123456");
	shippingInfoRequestData.put("relation", "self");
	shippingInfoRequestData.put("label", "home");

	// 4. AddShippingAddress
	helper.shippingInfo(cartid, shippingInfoRequestData);

	Map<String, String> billingInfoRequestData = new HashMap<String, String>();
	billingInfoRequestData.put("title", "Mr");
	billingInfoRequestData.put("first_name", "Bill");
	billingInfoRequestData.put("last_name", "Mathew");
	billingInfoRequestData.put("line_1", "BartonHillFarm");
	billingInfoRequestData.put("line_2", "BartonHillRoad");
	billingInfoRequestData.put("city", "Luton");
	billingInfoRequestData.put("state", "Bedfordshire");
	billingInfoRequestData.put("country", "UK");
	billingInfoRequestData.put("postal_code", "LU28NF");
	billingInfoRequestData.put("email", "samsung135test@gmail.com");
	billingInfoRequestData.put("phone", "07911123456");
	billingInfoRequestData.put("relation", "self");
	billingInfoRequestData.put("label", "home");

	// 5. AddBillingAddress
	helper.billingInfo(cartid, billingInfoRequestData);

	// 6. GetDelivieryModes
	Response getDeliveryModeResponse = helper.getDeliveryModes(cartid);
	assertionHelper.assertResponseCode200(getDeliveryModeResponse);

	// Get delivery details
	Map<String, String> deliveryModeDetails = helper.getDeliveryDetails(getDeliveryModeResponse);

	// 7. PostDeliveryModes
	helper.addDeliveryModes(cartid, deliveryModeDetails);

	// 8. GetPaymentOptions
	// Get payment options and assert the available payment options
	String[] paymentOptions = paymentOptions = helper.paymentOptions(cartid);

	// 9. GetEncryptedInfo

	PaymentType pt = PaymentType.AdyenCC;

	String poId = helper.placeOrder(cartid, pt, dp.getPaymentTypeParameters(pt));
	System.out.println(poId);
	
	*
	*
	*
	*
	*
	


@FunctionalInterface
interface Highlighter
{
	public void highlightElement(WebElement ele);
}

	*/
}

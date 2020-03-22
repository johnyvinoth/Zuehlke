Feature: CartFeatures

@AddToCard @AllTests @CartFeatures
Scenario: Add a product to the Cart
	Given user Launch Chrome browser
	When User opens URL 
	And user clicks SignIn link
	And User enters Email as "johnyvinoth@gmail.com" and Password as "ferrari"
	And Click on Login
	Then Page Title should be "My account - My Store"
	And Success message should display "Welcome to your account. Here you can manage all of your personal information and orders." 
	Then User click on Home button
	And Add a product to the cart
	And Click Proceed to Checkout button from Popup
	Then Page Title should be "Order - My Store"
	And Message should display "Shopping-cart summary"
	And Click Proceed to Checkout button from Shopping Cart Summary page
	And Message should display "Addresses"
	And Click Proceed to Checkout button from Addresses page
	And Message should display "Shipping"
	Then Click Agree Terms and conditions checkbox
	And Click Proceed to Checkout button from Shipping page
	And Message should display "Please choose your payment method"
	Then Click Payby wire from Payment page
	And Message should display "Order summary"
	Then Click confirm order button from Order Summary page
	And Message should display "Order confirmation"
	And Message should display "Your order on My Store is complete."
	Then Page Title should be "Order confirmation - My Store"
	Then close browser
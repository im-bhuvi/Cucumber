Feature: To validate the working functionality of Flipkart

Scenario Outline: To validate if user can add products to cart
Given The user should be in flipkart mani page
When The user have to search a product"<product>" and enter into product page
And The user have to select the product by clicking
Then The user have to click add to cart bttn 

Examples:
|product|
|iphone|
|onepluse mobile|
|laptop|
Feature: OrangeHrm Login
Scenario Outline: OrangeHrmLogin
Given User in OrangeHrm Home page "https://opensource-demo.orangehrmlive.com/"
When User login OrangeHrm application with <username> and <password>
Then OrangeHrm Dashboard page displayed "true"
And Profile page displayed "true"
Examples:
|  username | password|
|  Admin    | admin   |
|  Test@123 | Test    |
|  Admin    | test123 |
|  Test     | admin   |


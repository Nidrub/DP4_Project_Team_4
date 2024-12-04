Winston Shih
Ruben Rodriguez (Team Captain)
Syed Shah
Neil Dasari
CS 4352 Group 4 DP6 Read Me Documentation
Java files

App name: Finance Go

Overall this app is a financial literacy app that is meant to help users with financial literacy through a gamified experience. This app provides financial goals for users to undertake and then as users complete tasks they are able to unlock rewards that they can then equip on their in-person avatar. 
Before the app can work, the user has to make sure the phone is not in dark mode since the background is in day mode and dark mode would mess with UI design. Another system requirement is that for iPhones the android app navigation buttons show up on the bottom of the iPhone’s swipe up black bar button to optimize user experience. The app requires users to grant it permission before the app can download, also make sure that the phone is in light mode, not in dark mode.
When the app loads, the screen first lands on the login page. The user has to either sign in with an existing username and password combination (like user+123) or sign up. If the user has questions about the game, they can click the Help Documentation buttons in sign up or login pages. The help documentation page has options to navigate back to the login page or signup page, task overview page, or instructions page. The help documentation page also has an explanation of the purpose of this app. Task overview page explains the simple, moderate, and complex tasks this app implemented. The instructions page explains what the user should do to successfully obtain all the armors and complete all financial goals in the game. The user can press back buttons to redirect from task overview or instruction pages to help documentation page or from task documentation page to login or sign up pages. A successful login prompts a successful login Toast message and redirects to the input info activity page. If the user uses a different combination, then the login fails and the app sends a failed login Toast feedback message. If a user chooses to make their own username and password combination, then they have to press the sign-up button. 
Once they press that button, they get redirected to the sign-up page. In the sign-up page, the user can set up a new user name and password combination as long as it is not the default user and 1234 combination. If there is a blank text field or if the user and 1234 combination is used, then the page sends a set-up new username and password Toast feedback notification. The user has to fill in both text fields for username and password and press the sign-up button to redirect to the input info activity page. A successful signup Toast message indicates a successful signup.
After logging in or signing up, the Input_Info_Activity requires users to input information about their current income and expenses. The expenses include water bill, gas bill, mortgage/rent, electric bill, food, and internet bill. The program requires the user to fill in any positive integer value for each income or expense text field so the next button can function. If any field is empty, the Android system prompts a message saying every income or expense text field must be filled. Once all fields are filled out, the Android system will print out “Completed” and the app redirects to Input_Subscriptions_Activity.java.

In Input_Subscriptions_Activity, the user is given a chance to input any subscriptions they have. The user must write the name of their subscription and the amount of money they charged for that subscription for each month. If the user wants to input more than three subscriptions, they have to click the add more button each time they want to add another subscription. The maximum amount of subscriptions you can input is 5 subscriptions. If a user tries to click on the submit button without inputting a subscription’s name and price, then the system says the user needs to input at least one subscription. If a user inputs one subscription’s name and price, then the program moves into User_Intro_Display.java.

After this users are moved over to the User_Intro_Display where users are then given the results of the information they provided. They moved to a screen that shows their name, their income, their spendings, as well as their savings. Users can then press the start button to start the game and move them onto the main game page.
Once users are put on the main game page they will see a UI that shows a player avatar equipped with default armor that is standing on some grass. To the left of the avatar on the main game page is the edit info button. Once users click this button, they can enter in new information for their subscriptions, income, and costs, and savings and will then be sent to the user intro display page again which will show the new results of the new information they entered. Users can then press the start button to return to the main game page. Below the avatar is the financial goals section with three financial goals that users can complete each with a unique reward of armor attached if the user completes each task. If the user completes the task in real life then they can choose to claim this reward. Once users claim a task reward it will automatically equip the armor. The armor will also show up on the inventory page, but the inventory and reward buttons are disabled. After the user completes all the tasks in the Recycler View of the main game page, an arrow appears to the left of the user avatar and a pop-up indicates to the user that all tasks are complete. The arrow is supposed to visually indicate that the user should click on the character avatar. Users that are on the main game page can press on the game avatar and will then be sent over to the avatar statistics page where users will be able to see their avatar with whatever equipped armor they have.
After the user clicks on the avatar, they get redirected to the main_character_stats page to view the stats of the rewards that they have equipped currently. Below the avatar are a bunch of statistics such as their HP, Defense, Attack, and Protect with statistics next to them such as “50”, “10”, and “20” depending on the item equipped. This stage of the game only shows the upgraded pants, armor, or helmet stats since the user’s avatar is currently equipping that equipment after completing tasks. The main game page has a bottom navigation button layout of inventory button, task history button, and rewards page.
The inventory page button is initially locked and says “Complete task” on the button. The inventory button only unlocks after the user finishes all tasks. After the user finishes the tasks and presses the inventory page button, they are moved over to the inventory page (inventory_page). Here users will be able to equip any equipment they unlock by clicking on the equipment which will make a pop-up show up with the statistics for the particular reward (such as +10 Health, +10 Protection, +10 Attack)  and equip option. If they choose to equip then the game avatar will equip the armor as well. The changes in the avatar’s appearance will be reflected in the main game page and main_character_stats_page. The main_character_stats_page also syncs the user’s current equipment stats based on what is equipped in the inventory. The equipment that is transparent is not equipped, while the non-transparent equipment is equipped. They can press the red x button to remove the pop-up if they do not want to equip their new equipment. 
If the user presses the reward button and goes to the reward page, they will see a list of locked awards at the top of the screen that the users could potentially get in future goal completions. Below the locked rewards is the sword reward unlock. Users can press on the sword image and click “equip” only if they have completed all seven goals listed on the main game page. After they have equipped the sword, the Android app automatically redirects to the character avatar on the main game page. The game is complete and the home, inventory, character avatar, and rewards buttons are functional so the user can check the stats of the sword they unlock in the main_character_stats_page. The player can also see how their avatar looks with the sword in the main_game_page and main_character_stats_page and view the sword in their inventory. When the user returns to the reward page, the unlock sword button is gone. 
In the main game page, the user can click on the task history button to view tasks they have completed in the task history page. The task history page goes from top to bottom in chronological order since it tracks the task progression of the player’s profile. Each entry in task history shows the reward image, the description of the reward, the task description, and the completion status of the task. The task history page has a similar button layout as the main game page except the task history button is replaced by the home button.
In the background of the main game page and task history page, there is a button to the left of avatar called edit info button. This button navigates the user to edit account page. The edit account page has buttons that directs users to edit their password  page or edit financial information page. The edit password only allows the user to reset password if they input their old password once and new password twice. For the edit info feature, the user can remove subscriptions or change values for income, expenses, and subscriptions.
The button to the right of the character avatar in the main game page and  task history page is the help documentation button. This button navigates to the help documentation page of the game. The help documentation page has options to navigate back to the main game page or task history page, task overview page, or instructions page. The help documentation page also has an explanation of the purpose of this app. Task overview page explains the simple, moderate, and complex tasks this app implemented. The instructions page explains what the user should do to successfully obtain all the armors and complete all financial goals in the game. The user can press back buttons to redirect from task overview or instruction pages to help documentation page or from task documentation page to main game page or task history page.
The first limitation of the program is that the game does not have gold chestplate armor and pants because our group ran out of ideas for tasks after we came up with 4 more tasks. The second limitation is that we could not sync the reward page task list with the task history list. The third limitation is that we did not implement a logout function because it was too complicated. The last limitation was that 
Here is a link demonstrating how our app works: 
https://youtu.be/OLE20Zb_5i4



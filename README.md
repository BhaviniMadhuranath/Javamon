# OBJECT ORIENTED ANALYSIS AND DESIGN WITH JAVA - UE20CS352

> Team 7
> 
> Ayushmaan Kaushik - PES2UG20CS082
> 
> Bhavini Madhuranath - PES2UG20CS088
> 
> Gowri Nandana PK - PES2UG20CS126

### Project Title - Javamon, A Text Based Action Game

### Project synopsis

In this game, players start off by selecting their primary character from a roster of unique and diverse characters. Each character has its own set of abilities, stats, and personality, which can affect the gameplay and story.

The game is divided into a series of battles, each of which takes place in different locations and against different enemies. After winning each battle, the player gets to pick a new item and a new character to add to their team. The maximum number of characters a player can use is three, so players must carefully choose which characters to use based on their strengths, weaknesses, and abilities. New items include power ups such as armour, new attacks and potions.

Once the player has won three battles, they face off against a powerful boss enemy, who is more challenging than the regular enemies and requires careful planning and strategy to defeat. If the player wins the boss battle, they complete the game and can start again with a new character and higher difficulty level.

Overall, this turn-based battle game provides players with a challenging and engaging gameplay experience, with diverse characters, randomized battles, and various difficulty modes to keep players coming back for more.

---

### Tech Stack

frontend - JavaScript Framework

backend - Java with Spring

database - MongoDB

---

### Future scope

The same can be extended to play in multiplayer mode, where the players can choose their characters and battle amongst themselves. Futher levels with varying difficulty can also be generated. 

---

### Use case diagrams

![](C:\Users\Bhavini\Pictures\Screenshots\Screenshot_20230226_194305.png)

![](C:\Users\Bhavini\Pictures\Screenshots\Screenshot_20230226_194346.png)

---

### Use case specifications

#### 1. Choose fighter

- Name - Choose fighter

- Summary - The user chooses a fighter from the team to fight against the villain for the current turn

- Actors - Player

- Pre-conditions - User must have chosen difficulty and cleared all previous levels

- Description
  
  - User accesses list of fighters chosen before the level begins
  
  - User chooses fighter for the turn

- Exceptions - Player is defeated by villain in the previous turn

- Alternate flows
  
  - User forfeits the battle
  
  - User chooses to use item

- Post-conditions - The player moves to choose their move

#### 2. Launch attack

- Name - Launch attack

- Summary - The player chooses an attack from the fighter's abilities to launch against the villain in the current turn

- Actors - Player

- Pre-conditions - User must have chosen fighter

- Description
  
  - User accesses list of attacks provided in the list of fighter's abilities
  
  - User chooses attack for the turn

- Exceptions - Player is defeated by the villain in the previous turn

- Alternate flows
  
  - User forfeits the battle
  
  - User chooses to use item

- Post-conditions
  
  - The attack causes damage to the villain
  
  - The turn moves to the villain

#### 3. Use item

- Name - Use item

- Summary - The player chooses an item from the player's inventory to gain a power-up such as healing or skipped villain turn in the current turn

- Actors - Player

- Pre-conditions - User must have chosen difficulty and cleared all previous levels

- Description
  
  - User accesses list of items provided in the player's inventory
  
  - User chooses item for the turn

- Exceptions - Player is defeated by the villain in the previous turn

- Alternate flows
  
  - User forfeits the battle
  
  - User chooses to launch attack

- Post-conditions
  
  - The item causes a special effect in the game
  
  - The turn moves to the villain

#### 4. Defend

- Name - Defend

- Summary - The player chooses a defence from the fighter's abilities to launch against the villain in the current turn

- Actors - Player

- Pre-conditions - User must have chosen fighter

- Description
  
  - User accesses list of defenses provided in the list of fighter's abilities
  
  - User chooses defence for the turn

- Exceptions - Player is defeated by the villain in the previous turn

- Alternate flows
  
  - User forfeits the battle
  
  - User chooses to use item

- Post-conditions
  
  - The turn moves to the villain
  
  - the defence reduces damage caused by villain

#### 5. Claim reward

- Name - Claim reward

- Summary - The player claims a reward at the end of each level after defeating the villain

- Actors - Player

- Pre-conditions - User must have won the previous level

- Description
  
  - User accesses list of new fighters provided in the menu
  
  - User chooses new fighter to add to the team
  
  - User accesses list of items and weapons provided in the menu
  
  - User chooses between
    
    - adding an extra item to inventory
    
    - adding an extra ability in one of their fighters

- Exceptions - Player is defeated by the villain

- Alternate flows
  
  - User quits the game

- Post-conditions
  
  - The player moves on to the next battle

---

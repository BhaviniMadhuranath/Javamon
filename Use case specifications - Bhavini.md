## Use case specifications - Bhavini

#### 1.  Choose fighter

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





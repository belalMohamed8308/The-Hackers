//method add fav
	public static  void addFavorite(int index){
		
		if (Favorite_count[index]> 150) {
			System.out.println("can't add more contacts to favourite");
			return;
		}
		//to make sure that no of fav contacts is not more than the no of places in fav list
	int fav_user_index= searchRecipient(index);
		// calling this method to bring me the index of the  one I searched to add to fav
		if (fav_user_index== index) {
		//	System.out.println("you can't add yourself");
		return;	
		}
		if (fav_user_index==-1) {
			return;
			//fav user index still -1 means that this user has no index so user is not found
		}
		for (int y =0; y<Favorite_count[index]; y++){
		if (Favorite_contacts[index][y]== fav_user_index){
			System.out.println("This user is already in favourite contacts "); 
						return;}
			/*for loop to know if there is an index in 
			fav contavts array equals the index of user required to be added to fav
			if true print user already in fav and return*/
		}
		
		int x = Favorite_count[index] ;
		//saving no. of fav of user (me) in var x
		Favorite_contacts[index][x]= fav_user_index;
		//saving index of fav user called from search to the first place with no users in my fav list 
		Favorite_count[index]++;
		//inc fav count of me by one 
		System.out.println(user_full_name[fav_user_index] + "is added to favourites ");
		//getting name of user with index (fav_user_index) to be printed
		System.out.println(" ");
	}
		 
	
	 //method show fav
	public static void showFavorites(int index){
		if (Favorite_count[index]==0){
			System.out.println("no favourites found");
			return;}
		// to check if number of fav contacts =0 means there is no fav contacts saved
		System.out.println("your favourite contacts : ");
		for (int d=0; d<Favorite_count[index]; d++){
			int fav_index = Favorite_contacts[index][d];
			//saving index of favourite contact in var fav_index
			System.out.println("user name : "+ user_full_name[fav]+" "+" , id :"+ user_ID[fav_index]);
		}
		//printing fav user name and id 
		System.out.println(" ");
	}
//method remove fav
	public static void removeFavorites(int index){
		if (Favorite_count[index]==0){System.out.println("no favourites found");
			return;}
		//if number of fav contacts of the user (me) =0 , no fav will be shown and the function will be returned (stopped)
		Scanner input = new Scanner (System.in);
		showFavorites(index);
		// show the list of fav contacts for user to choose one to remove
		System.out.println("choose the id of user ");
		int user_to_remove = input.nextInt();
		input.nextLine();
		//saving id that user want to remove in var called user_to_remove
		int removed = -1 ;
		//using a var called remove and = -1 to check if the chosen user is in fav list or not
				for (int j =0; j<Favorite_count[index]; j++){
					// for loop that starts from 0 to the number just before count of fav contacts for user(me)
			   int fav = Favorite_contacts[index][j];
					//saving fav contact in var of fav
					if (user_ID[fav]==user_to_remove){
						// if user_to_remove (entered by user (me)) = to user id of index 'fav' → 'remove' var will change to j
				removed = j;
				break;
			}
				}		
		if (removed==-1){System.out.println("user is not in favourites list");
			return;}
		// 'remove'  var still -1 means the searched fav conatct is not found in list of fav
		for (int t=removed;t<Favorite_count[index]-1;t++){
			Favorite_contacts[index][t]=Favorite_contacts[index][t+1];
		}// start loop with removed (index of user_to_remove) and loop till (fav count -1) as the elements move 
		//one step back so count will dec by 1 
	Favorite_count[index]--;
		// Fav counts decrease by one 
		System.out.println("user removed from favourites list");
		System.out.println(" ");
 
	}

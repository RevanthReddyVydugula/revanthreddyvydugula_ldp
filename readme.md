The problem statement is "John is a recruiter in a company and wants to map candidates based on their location preferences. Develop an algorithm to match candidates to the locations based on their preferences."
- The assignement is about assigning the location for the recruited candidates based on their preferences list.
- Initially, I have gathered the data of locations and their capacitites using hashmap. Also we need to gather candidates and their preference lists.
- We iterate through the each candidates location preference list and locations, if we match location and capacity of location is greater than zero, then we assign that particular location to that condidates respectively.
- Repeat this process for each and every candidate.
- If we donot find location for the candidate, then simply add "Preferred locations are not available".
- This is the algorithm used for mapping the locations for the candidates based on their preferences.
- Below are two scenarios with inputs and outputs:
- ![Screenshot (102)](https://github.com/RevanthReddyVydugula/zemoso-training/assets/170494551/0d128dfa-f07a-4cc4-a91d-233aab7256be)

- ![Screenshot (103)](https://github.com/RevanthReddyVydugula/zemoso-training/assets/170494551/80214ce8-19e5-4883-8864-6797d9bb4c0e)


- The time complexity of the code is O(nc⋅np) and the space complexity is also O(nc⋅np), where Nc is number of candidates and Np is average number of preference locations of each list.


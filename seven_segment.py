binary_number = input("Enter binary code")

for numbers in range(1,2):
    if((binary_number[7]) == '1' and len(binary_number) <= 8):
        if((binary_number[0]) == '1'):
            print("  AA");
      
        
        if((binary_number[1]) == '1' and binary_number[5] == '0'):
            print("    B")
            print("    B")
            print("    B")
            print("    B")
     
        
        if(binary_number[1] == '1' and binary_number[5] == '1'):
            print("F    B")
            print("F    B")
            print("F    B")
            print("F    B")
      
       
        if(binary_number[6] == '1' and binary_number[1] == '0'):
            print("F     ")
            print("F     ")
            print("F     ")
            print("F     ")
       
        if(binary_number[6] == '1'):
            print("  GG")
     
        
        if(binary_number[2] == '1' and binary_number[4] == '0'):
            print("    C")
            print("    C")
            print("    C")
            print("    C")
               
        if(binary_number[4] == '1' and binary_number[2] == '0'):
            print("E    ")
            print("E    ")
            print("E    ")
            print("E    ")
     
        
        if(binary_number[2] == '1' and binary_number[4] == '1'):
            print("E    C")
            print("E    C")
            print("E    C")
            print("E    C")
        
    
        
        if(binary_number[3] == '1'):
            print("  DD\n")
        else:
            print("  ")
            break;
        
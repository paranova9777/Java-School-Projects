def bounce():
  folder=pickAFolder()
  for x in range(0,20):
    canvas=makeEmptyPicture(400,400)
    addOvalFilled(canvas,200-(x*10),x*10,10,10,red)
    fileName=fileNumber(x)
    writePictureTo(canvas,folder+fileName)
    
  for x in range(20,40):
    canvas=makeEmptyPicture(400,400)
    addOvalFilled(canvas,(x-20)*10,x*10,10,10,red)
    fileName= fileNumber(x)
    writePictureTo(canvas,folder+fileName)
    
  for x in range(40,60):
    canvas=makeEmptyPicture(400,400)
    addOvalFilled(canvas,(x*10)-200,10*(80-x),10,10,red)
    fileName=fileNumber(x)
    writePictureTo(canvas,folder+fileName)
  
  for x in range(60,80):
    canvas=makeEmptyPicture(400,400)
    addOvalFilled(canvas,1000-(x*10),10*(80-x),10,10,red)
    fileName=fileNumber(x)
    writePictureTo(canvas,folder+fileName)
  
  movie=makeMovieFromInitialFile(folder+"frame000.jpg")
  playMovie(movie)
  
def fileNumber(x):
  if x>=10:
    fileNum= "0"+str(x)
  if x>=100:
    fileNum= str(x)
  if x<10:
    fileNum="00"+str(x)
  fileName="frame"+fileNum+".jpg"
  return fileName
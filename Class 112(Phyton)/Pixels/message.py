def message():
  myPic = makePicture(pickAFile())
  canvas = makeEmptyPicture(getWidth(myPic),getHeight(myPic))
  for x in range(0,getWidth(myPic)):
    for y in range(0,getHeight(myPic)):
      pix = getPixel(myPic,x,y)
      rVal = getRed(pix)
      if rVal%2 == 1:
        setRed(pix,rVal+1)
  addText(canvas,121,92,"Brian-- Have a nice day people.")
  for x in range(0,getWidth(canvas)):
    for y in range(0,getHeight(canvas)):
      pix2 = getPixel(canvas,x,y)
      color = getColor(pix2)
      if color !=white:
        pix3 = getPixel(myPic,x,y)
        rVal2 = getRed(pix3)
        setRed(pix3,rVal2+1)
  show(myPic)
  writePictureTo(myPic,"C:\\Users\\Profile\\Desktop\\newPic\\blueMotorcycle1.jpg")
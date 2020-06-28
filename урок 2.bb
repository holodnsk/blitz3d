Graphics3D 640, 480
SetBuffer BackBuffer()

cam=CreateCamera()
PositionEntity cam,0,0,-5
CameraClsColor cam,0,128,255

sphere=CreateSphere()
PositionEntity sphere,0, 0, 0
EntityColor sphere,250,155,0

cube=CreateCube()
PositionEntity cube,5,0,5
EntityColor cube,255,0,255 

cylinder=CreateCylinder()
PositionEntity cylinder,0,0,5
EntityColor cylinder,0,240,255

cone=CreateCone()
PositionEntity cone,-5,0,5
EntityColor cone,0,255,0

cylinder2=CreateCylinder()
PositionEntity cylinder2,0,5,5
EntityColor cylinder2,0,0,255

Floor1=CreatePlane()
PositionEntity Floor1,0,-7,0

a=0

While Not KeyDown(1)

If a>100 Then 
EntityColor sphere,Rnd (0,255),155,Rnd (0,255)
a=0
End If 
a=a+1

TurnEntity cube, 1, 1, 1

TurnEntity cone, -4, 5, 1

ScaleEntity cylinder,2,a*0.01,1

EntityAlpha cylinder2,a*0.01

If KeyDown(200) MoveEntity cam, 0, 0, 0.2
If KeyDown(208) MoveEntity cam, 0, 0, -0.2
If KeyDown(203) TurnEntity cam, 0, 2, 0
If KeyDown(205) TurnEntity cam, 0, -2, 0

If KeyDown(44) MoveEntity cam, 0, .1, 0
If KeyDown(45) MoveEntity cam, 0, -.1, 0

UpdateWorld
RenderWorld

Flip
Wend

End 

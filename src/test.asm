@0
D=A
@10001
M=D
@10001
D=M
@t
M=D
@1
D=A
@i
M=D
(LOOP)
@i
D=M
@10
D=D-A
@END
D;JGT
@1
D=A
@10002
M=D
@10
D=A
@10003
M=D
@t
D=M
@10004
M=D
@i
D=M
@10005
M=D
@10005
D=M
@10004
M=D+M
@10004
D=M
@t
M=D
@i
M=M+1
@LOOP
0;JMP
(END)
@END
0;JMP
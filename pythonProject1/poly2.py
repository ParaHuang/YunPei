# 定义一个父类：Media，有play()方法（raise NotImplementedError)
class Media:
    def play(self):
        raise NotImplementedError("Need a play method")

# 实现三个子类，Audio，Video，Stream，各自实现play方法
# 创建Audio时，要指定song（instance variable），然后play时打印
# "正在播放xxx"
# inheritance of Media
class Audio(Media):
    def __init__(self,song):
        self.song = song ##instance variable

    def play(self):
        print(f"{self.song} playing")

# 创建Video时，不需要制定任何东西，play方法打印
# "正在播放视频"
class Video(Media):
    def play(self):
        print("Video playing")

# 创建Stream时，指定url，play方法打印
# "xxx的视频缓冲完毕，开始播放"
class Stream(Media):
    def __init__(self, url):
        self.url = url

    def play(self):
        print(f"{self.url}的视频缓冲完毕，开始播放")

# 定义一个start_play方法，要求传入一个Media对象，调用它的play方法
## another method testing for polymorphism
def start_play(x:Media):
    print("time to play something")
    x.play()
    print()



a = Audio("Love Story")  ##call init method
b = Stream("https://www.youtube.com/watch?v=dQw4w9WgXcQ")
c = Video()

start_play(a)
start_play(b)
start_play(c)
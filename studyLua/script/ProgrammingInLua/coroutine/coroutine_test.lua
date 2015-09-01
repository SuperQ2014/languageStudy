co = coroutine.create(function ()
    print("Hi")
  end)

print(co)
print(coroutine.status(co))
coroutine.resume(co)
print(coroutine.status(co))
print(coroutine.resume(co))
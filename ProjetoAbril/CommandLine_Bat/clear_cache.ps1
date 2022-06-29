netsh interface ip delete arpcache
netsh interface ip delete destinationcache
netsh winsock reset catalog
netsh interface set interface name="Ethernet0" admin=DISABLED
netsh interface set interface name="Ethernet0" admin=ENABLED
ipconfig /flushdns
Start-Sleep -Second 60

import pandas as pd

def convert_row(row):
    return '''<bean id="%s" class="ug.kap.tje.lab04.domain.Person">
    <property name="firstName" value="%s" />
    <property name="lastName" value="%s" />
    <property name="email" value="%s" />
    <property name="companyName" value="%s" />
    </bean>
    ''' % (row.first_name.lower(), row.first_name, row.last_name, row.email, row.company_name)

df = pd.read_csv('MOCK_DATA.csv')

out = '''<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">\n
'''
all_rows = '\n'.join(df.apply(convert_row, axis=1))
out = out + all_rows + '\n</beans>'

with open("src/main/resources/beans.xml", mode="w") as f:
    f.write(out)
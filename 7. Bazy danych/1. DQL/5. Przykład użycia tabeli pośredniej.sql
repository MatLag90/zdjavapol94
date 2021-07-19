SELECT
    employee.id,
    employee.first_name,
    employee.last_name,
    certificate.name AS cert_name
FROM
    employee
    INNER JOIN
    employee_certificate AS emp_cert ON emp_cert.employee_id = employee.id
    INNER JOIN
    certificate ON certificate.id = emp_cert.certificate_id